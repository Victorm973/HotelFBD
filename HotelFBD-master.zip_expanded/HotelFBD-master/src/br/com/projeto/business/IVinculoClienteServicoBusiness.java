package br.com.projeto.business;

import java.util.List;

import br.com.projeto.entidades.Cliente;
import br.com.projeto.entidades.VinculoClienteServico;

public interface IVinculoClienteServicoBusiness {

	public boolean salvarOuEditar(VinculoClienteServico vinculo);
    public VinculoClienteServico buscarPorid(Long id);
    public List<VinculoClienteServico> getAll(Cliente cliente);
}
