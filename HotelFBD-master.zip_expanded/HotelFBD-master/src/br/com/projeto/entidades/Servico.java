package br.com.projeto.entidades;

public class Servico {

	private Long id;
	private int codigo;
	private double valor;
	private String descricao;
	
	public Servico() {
	}
	
	

	public Servico(Long id, int codigo, double valor, String descricao) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
