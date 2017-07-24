package br.com.projeto.dao;

import java.util.List;

import br.com.projeto.entidades.Reserva;

public interface IReservaDao {

	public Reserva salvar(Reserva reserva)throws Exception;
	public boolean editar(Reserva reserva);
	public Reserva buscarPorid(Long id);
	public List<Reserva> getAll();
	
}
