package br.com.projeto.entidades;


public class VinculoClienteServico {
	
	private Double valor;
	private String nomeServicos;
	private Long id;
	private String cpfCliente;
	private Long idServico;

	public VinculoClienteServico() {
	}
	
	public VinculoClienteServico(String nome, double valor) {
		
		this.nomeServicos=nome;
		this.valor=valor;	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Long getIdServico() {
		return idServico;
	}

	public void setIdServico(Long idServico) {
		this.idServico = idServico;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getNomeServicos() {
		return nomeServicos;
	}

	public void setNomeServicos(String nomeServicos) {
		this.nomeServicos = nomeServicos;
	}
	
}
