package br.com.profcris.exemplo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Departamento é uma entidade
@Table(name="tbl_departamento") // cujo nome da tabela foi definido

public class Departamento {
	
	
	public Departamento(int id, String nome){
		   this.id = id;
		   this.nome = nome;
		   
	}
		
	@Id
	@Column(name="id") // id é chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // gerado pelo banco
	
	private int id; // nome da coluna
	
	@Column(name="nome")
	
	private String nome;
	
	
	
	@JsonIgnoreProperties("depto")
		
	//Isso impede, toda vez que o JPA encontrar um produto de buscar a lista de produtos que
	//estão relacionada ao departamento que ele pertence.
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "depto")	
	
	private List<Produto> listaProdutos;

	@SuppressWarnings("unused")
	private String getNome() {
		return nome;
	}

	@SuppressWarnings("unused")
	private void setNome(String nome) {
		this.nome = nome;
	}

	@SuppressWarnings("unused")
	private int getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(int id) {
		this.id = id;
	}

	@SuppressWarnings("unused")
	private List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	@SuppressWarnings("unused")
	private void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
