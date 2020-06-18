package br.com.sistemacris.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name="tblproduto")
	
	
	public class produto {
		
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="nome", length = 100)
	private String nome;
	@Column(name="detalhes", length = 500)
	private String detalhes;
	@Column(name="preco")
	private float preco;
	@Column(name="linkfoto", length = 200)
	private String linkfoto;
	
	
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
	private String getDetalhes() {
		return detalhes;
	}
	private void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	private float getPreco() {
		return preco;
	}
	private void setPreco(float preco) {
		this.preco = preco;
	}
	private String getLinkfoto() {
		return linkfoto;
	}
	private void setLinkfoto(String linkfoto) {
		this.linkfoto = linkfoto;
	}
	
	
	
	
	
	}
