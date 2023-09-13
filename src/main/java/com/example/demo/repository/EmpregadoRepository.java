package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Integer> {

	List<Empregado> findByNome(String nome);
	
	Boolean existsByCargoSalario(Float salario);
	
	List<Empregado> findFirst2ByChefeNomeOrChefeIdOrderByCargoSalarioDesc(
			String nomeChefe, Integer idChefe);
	
}
