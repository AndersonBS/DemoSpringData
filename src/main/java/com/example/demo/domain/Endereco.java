package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	@Column(name = "EMP_RUA")
	private String rua;
	
	@Column(name = "EMP_NUMERO")
	private int numero;
	
	@Column(name = "EMP_COMPLEMENTO")
	private String complemento;
	
	@Column(name = "EMP_CEP")
	private String cep;

}

