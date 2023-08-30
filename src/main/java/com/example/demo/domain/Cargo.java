package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "TB_CARGO")
public class Cargo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CAR_ID")
	private int id;
	
	@Column(name = "CAR_NOME")
	private String nome;
	
	@Column(name = "CAR_SALARIO")
	private float salario;
	
	@OneToOne(mappedBy = "cargo")
	private Empregado empregado;
	
	@Version
	@Column(name = "CAR_VERSAO")
	private int versao;

}

