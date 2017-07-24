package br.com.projeto.business;

import java.util.List;

import br.com.projeto.entidades.Reserva;

public interface IReservaBusiness {

	public boolean salvarOuEditar(Reserva reserva);
    public Reserva buscarPorid(Long id);
    public List<Reserva> getAll();
	
}
