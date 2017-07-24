package br.com.projeto.entidades;


public class VinculoClienteServico {
	
	private Long id;
	private String cpfCliente;
	private Long idServico;

	public VinculoClienteServico() {
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
	
}
