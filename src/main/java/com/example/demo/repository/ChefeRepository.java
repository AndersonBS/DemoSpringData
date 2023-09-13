package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.domain.Chefe;
import jakarta.transaction.Transactional;

public interface ChefeRepository extends JpaRepository<Chefe, Integer> {
	
	@Query("select che from Chefe che where che.nome = :nomeChefe")
	List<Chefe> findByNome(String nomeChefe);

	@Query("select emp.nome from Chefe che " + 
			"join che.empregados emp " + 
			"where che.id = ?1 or che.nome = ?2")
	List<String> findNomeEmpregadosByChefeIdOrChefeNome(Integer idChefe, String nomeChefe);
	
	@Transactional
	@Modifying
	@Query("update Chefe set nome = :nomeChefe where id = :idChefe")
	void updateNomeById(Integer idChefe, String nomeChefe);
	
}

