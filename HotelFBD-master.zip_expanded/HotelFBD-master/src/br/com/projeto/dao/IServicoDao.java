package br.com.projeto.dao;

import java.util.List;

import br.com.projeto.entidades.Servico;

public interface IServicoDao {
	
	public Servico salvar(Servico servico)throws Exception;
	public boolean editar(Servico servico);
	public Servico buscarPorid(Long id);
	public List<Servico> getAll();

}
