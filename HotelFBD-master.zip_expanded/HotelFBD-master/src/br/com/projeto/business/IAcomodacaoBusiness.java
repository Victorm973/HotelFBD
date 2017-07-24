package br.com.projeto.business;

import java.util.List;

import br.com.projeto.entidades.Acomodacao;

public interface IAcomodacaoBusiness {

	public boolean salvarOuEditar(Acomodacao acomodacao);
    public Acomodacao buscarPorid(Long id);
    public List<Acomodacao> getAll();
}
