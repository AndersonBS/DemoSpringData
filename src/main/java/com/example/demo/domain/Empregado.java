package com.example.demo.domain;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;

@Entity
@Table(name = "TB_EMP")
public class Empregado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID")
	private int id;

	@Column(name = "EMP_NOME")
	private String nome;
	
	@Transient
	private boolean ocupado;
	
	@Embedded
	private Endereco endereco;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CAR_ID")
	private Cargo cargo;
	
	@ManyToOne
	@JoinColumn(name = "CHE_ID")
	private Chefe chefe;
	
	@ManyToMany(mappedBy = "empregados")
	private List<Tarefa> tarefas;
	
	@Version
	@Column(name = "EMP_VERSAO")
	private int versao;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Chefe getChefe() {
		return chefe;
	}

	public void setChefe(Chefe chefe) {
		this.chefe = chefe;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	@Override
	public String toString() {
		return "Empregado [id=" + id + ", nome=" + nome + ", ocupado=" + ocupado + ", endereco=" + endereco + ", cargo=" + cargo + ", chefe=" + chefe
				+ ", tarefas=" + tarefas + ", versao=" + versao + "]";
	}
	
}

