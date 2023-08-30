package com.example.demo.domain;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "TB_CHEFE")
public class Chefe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CHE_ID")
	private int id;
	
	@Column(name = "CHE_NOME")
	private String nome;
	
	@OneToMany(mappedBy = "chefe", fetch = FetchType.LAZY)
	private Set<Empregado> empregados;
	
	@Version
	@Column(name = "CHE_VERSAO")
	private int versao;
	
}

