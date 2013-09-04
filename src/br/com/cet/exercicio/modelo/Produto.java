package br.com.cet.exercicio.modelo;

public class Produto {
	
	private long id;
	private String descricao;
	private String preco;
	
	public Produto() {
	}
	
	
	public Produto(long id, String descricao, String preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Produto(String descricao, String preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	
}
