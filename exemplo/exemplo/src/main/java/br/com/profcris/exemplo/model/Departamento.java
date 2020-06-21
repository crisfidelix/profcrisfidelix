package br.com.profcris.exemplo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity // Departamento é uma entidade
@Table(name="tbl_departamento") // cujo nome da tabela foi definido

public class Departamento {
	
		
	@Id
	@Column(name="id") // id é chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // gerado pelo banco
	
	private int id; // nome da coluna
	
	@Column(name="nome")
	
	private String nome;
	

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

}
