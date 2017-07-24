package br.com.projeto.dao;

import java.util.List;

import br.com.projeto.entidades.Acomodacao;

public interface IAcomodacaoDao {

	public Acomodacao salvar(Acomodacao servico)throws Exception;
	public boolean editar(Acomodacao servico);
	public Acomodacao buscarPorid(Long id);
	public List<Acomodacao> getAll();
}
