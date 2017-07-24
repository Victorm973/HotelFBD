package br.com.projeto.dao;

import java.util.List;

import br.com.projeto.entidades.VinculoClienteServico;;

public interface IVinculoClienteServicoDao {
	
	public VinculoClienteServico salvar(VinculoClienteServico vinculo)throws Exception;
	public boolean editar(VinculoClienteServico vinculo);
	public VinculoClienteServico buscarPorid(Long id);
	public List<VinculoClienteServico> getAll();
}
