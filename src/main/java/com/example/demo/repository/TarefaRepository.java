package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.domain.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

	@Query(value = "SELECT emp.EMP_NOME FROM TB_TAREFA tar " + 
			"INNER JOIN TB_EMP_TAR et ON tar.TAR_ID = et.TAR_ID " +
			"INNER JOIN TB_EMP emp ON et.EMP_ID = emp.EMP_ID " +
			"WHERE tar.TAR_ID = :idTarefa ", nativeQuery = true)
	List<String> findNomeEmpregadosByTarefaId(Integer idTarefa);
	
	@Query(value = "SELECT COUNT(*) FROM TB_EMP_TAR WHERE EMP_ID = :idEmpregado ", 
			nativeQuery = true)
	Integer countTarefasByEmpregadoId(Integer idEmpregado);
	
}
