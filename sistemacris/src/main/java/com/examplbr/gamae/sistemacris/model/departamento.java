package com.examplbr.gamae.sistemacris.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import org.hibernate.annotations.CascadeType;
@Entity // Departamento é uma entidade
@Table(name="tbldepartamento")

public class departamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // gerado pelo banco
	@Column(name="id")
	private int id;
	@Column(name="nome", length=100)
	private String nome;
	@Column(name="localizacao", length=30)
    private String localizacao;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "depto")
	private List<produto> produto;
	
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getLocalizacao() {
		return localizacao;
	}
	private void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	

	
}
