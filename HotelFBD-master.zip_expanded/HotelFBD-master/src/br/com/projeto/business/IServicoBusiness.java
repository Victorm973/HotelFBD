package br.com.projeto.business;

import java.util.List;

import br.com.projeto.entidades.Servico;

public interface IServicoBusiness {

	public boolean salvarOuEditar(Servico servico);
    public Servico buscarPorid(Long id);
    public List<Servico> getAll();
}
