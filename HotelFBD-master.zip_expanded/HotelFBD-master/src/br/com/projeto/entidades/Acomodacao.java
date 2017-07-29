package br.com.projeto.entidades;

public class Acomodacao {

	private Long id;
	private int numero;
	private double valor_diaria;
	private String descricao;
	private boolean isDisponivel;
	
	public Acomodacao() {

	}

	public Acomodacao(Long id, int numero, double valor_diaria, String descricao, boolean isDisponivel) {
		super();
		this.id = id;
		this.numero = numero;
		this.valor_diaria = valor_diaria;
		this.descricao = descricao;
		this.isDisponivel = isDisponivel;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValor_diaria() {
		return valor_diaria;
	}

	public void setValor_diaria(double valor_diaria) {
		this.valor_diaria = valor_diaria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isDisponivel() {
		return isDisponivel;
	}

	public void setDisponivel(boolean isDisponivel) {
		this.isDisponivel = isDisponivel;
	}
	
	
}
