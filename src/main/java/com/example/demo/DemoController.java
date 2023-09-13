package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Chefe;
import com.example.demo.domain.Empregado;
import com.example.demo.repository.CargoRepository;
import com.example.demo.repository.ChefeRepository;
import com.example.demo.repository.EmpregadoRepository;
import com.example.demo.repository.TarefaRepository;

@RestController
@RequestMapping("controller")
public class DemoController {
	
	@Autowired
	private CargoRepository cargoRepository;
	
	@Autowired
	private ChefeRepository chefeRepository;
	
	@Autowired
	private EmpregadoRepository empregadoRepository;
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	@GetMapping(value = "/get")
	public ResponseEntity<String> get() {
		
		Chefe chefe = new Chefe();
		chefe.setNome("Chefão");
		chefeRepository.save(chefe);
		
		Optional<Chefe> chefaoOptional = 
				chefeRepository.findById(4);
		if (chefaoOptional.isPresent()) {
			Chefe chefao = chefaoOptional.get();
			System.out.println(chefao);
			
			
			chefao.setNome("Chefona");
			chefeRepository.save(chefao);
			
			chefeRepository.delete(chefao);
			
		}
		
		List<Empregado> empregadoList = empregadoRepository.findAll();
		
		System.out.println(empregadoRepository.findByNome("Empregado 1").get(0));
		
		System.out.println("Existe " + empregadoRepository.existsByCargoSalario(1000f));
		
		for (Empregado empregado : 
				empregadoRepository.findFirst2ByChefeNomeOrChefeIdOrderByCargoSalarioDesc("Chefe 1", 2)) {
			System.out.println("$ por chefe " + empregado);
		}
		
		System.out.println(chefeRepository.findByNome("Chefe 1").get(0));
		
		for (String empregado : 
				chefeRepository.findNomeEmpregadosByChefeIdOrChefeNome(2, "Chefe 1")) {
			System.out.println("Empregados por chefe: " + empregado);
		}
		
		chefeRepository.updateNomeById(3, "Outro Nome");
		
		for (String empregado : 
				tarefaRepository.findNomeEmpregadosByTarefaId(1)) {
			System.out.println("Empregados por tarefa: " + empregado);
		}
		
		System.out.println(tarefaRepository.countTarefasByEmpregadoId(2));
		
		return ResponseEntity.ok("\nworks" + empregadoList);
	}

}


