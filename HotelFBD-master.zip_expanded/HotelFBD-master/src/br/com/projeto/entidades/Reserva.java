package br.com.projeto.entidades;

import java.util.Date;

public class Reserva {

	private Long id;
	private Date inicioReserva;
	private Date fimReserva;
	private Long idAcomodacao;
	private String cpfCliente;
	
	public Reserva() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInicioReserva() {
		return inicioReserva;
	}

	public void setInicioReserva(Date inicioReserva) {
		this.inicioReserva = inicioReserva;
	}

	public Date getFimReserva() {
		return fimReserva;
	}

	public void setFimReserva(Date fimReserva) {
		this.fimReserva = fimReserva;
	}

	public Long getIdAcomodacao() {
		return idAcomodacao;
	}

	public void setIdAcomodacao(Long idAcomodacao) {
		this.idAcomodacao = idAcomodacao;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	
	
}
