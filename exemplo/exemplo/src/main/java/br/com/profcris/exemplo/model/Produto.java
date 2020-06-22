package br.com.profcris.exemplo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tbl_produto")

public class Produto {
	public Produto(int id, String nome, float preco){
		   this.id = id;
		   this.nome = nome;
		   this.preco = preco;
		   
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nome",length=100)
	private String nome;
	
	@Column(name="preco")
	private float preco;
	
	
	@JsonIgnoreProperties("listaProdutos")
	
	@ManyToOne
	private Departamento depto;

	@SuppressWarnings("unused")
	private int getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(int id) {
		this.id = id;
	}

	@SuppressWarnings("unused")
	private String getNome() {
		return nome;
	}

	@SuppressWarnings("unused")
	private void setNome(String nome) {
		this.nome = nome;
	}

	@SuppressWarnings("unused")
	private float getPreco() {
		return preco;
	}

	@SuppressWarnings("unused")
	private void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	

}
