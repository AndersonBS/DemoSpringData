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

	
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep + "]";
	}
	
}

