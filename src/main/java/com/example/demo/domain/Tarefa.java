package com.example.demo.domain;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "TB_TAREFA")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TAR_ID")
	private int id;
	
	@Column(name = "TAR_DESCRICAO")
	private String descricao;
	
	@ManyToMany
	@JoinTable(name = "TB_EMP_TAR",
			joinColumns = @JoinColumn(name = "TAR_ID"),
			inverseJoinColumns = @JoinColumn(name = "EMP_ID"))
	private List<Empregado> empregados;
	
	@Version
	@Column(name = "TAR_VERSAO")
	private int versao;
	
}

