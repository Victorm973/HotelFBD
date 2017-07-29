
package br.com.projeto.fachada;

import br.com.projeto.business.AcomodacaoBusiness;
import br.com.projeto.business.ClienteBusiness;
import br.com.projeto.business.IAcomodacaoBusiness;
import br.com.projeto.business.IClienteBusiness;
import br.com.projeto.business.IReservaBusiness;
import br.com.projeto.business.IServicoBusiness;
import br.com.projeto.business.IVinculoClienteServicoBusiness;
import br.com.projeto.business.ReservaBusiness;
import br.com.projeto.business.ServicoBusiness;
import br.com.projeto.business.VinculoClienteServicoBusiness;
import br.com.projeto.entidades.Acomodacao;
import br.com.projeto.entidades.Cliente;
import br.com.projeto.entidades.Reserva;
import br.com.projeto.entidades.Servico;
import br.com.projeto.entidades.VinculoClienteServico;

import java.util.List;

public class CoreFacade implements ICoreFacade{

    IClienteBusiness clienteBusiness;
    IServicoBusiness servicoBusiness;
    IVinculoClienteServicoBusiness vinculoClienteServicoBusiness;
    IAcomodacaoBusiness acomodacaoBusiness;
    IReservaBusiness reservaBusiness;
    
    public CoreFacade() {
        this.clienteBusiness = new ClienteBusiness();
        this.servicoBusiness = new ServicoBusiness();
        this.vinculoClienteServicoBusiness = new VinculoClienteServicoBusiness();
        this.acomodacaoBusiness = new AcomodacaoBusiness();
        this.reservaBusiness = new ReservaBusiness();

    }
    
    @Override
    public boolean salvarOuEditarCliente(Cliente cliente) {
        return clienteBusiness.salvarOuEditar(cliente);
    }

    @Override
    public Cliente buscarClientePorCpf(String cpf) {
		return null;
    }

    @Override
    public List<Cliente> getClientes() {
		return clienteBusiness.getAll();
    }

	@Override
	public boolean salvarOuEditarServico(Servico servico) {
		return servicoBusiness.salvarOuEditar(servico);
	}


	@Override
	public Servico buscarServicoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Servico> getServico() {
		return servicoBusiness.getAll();
	}

	@Override
	public boolean salvarOuEditarVinculoClienteServico(VinculoClienteServico vinculo) {
		return vinculoClienteServicoBusiness.salvarOuEditar(vinculo);
	}

	@Override
	public VinculoClienteServico buscarVinculoClienteServicoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VinculoClienteServico> getVinculoClienteServico() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean salvarOuEditarAcomodacao(Acomodacao acomodacao) {
		return acomodacaoBusiness.salvarOuEditar(acomodacao);

	}

	@Override
	public Acomodacao buscarAcomodacaoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Acomodacao> getAcomodacao() {
		return acomodacaoBusiness.getAll();
	}

	@Override
	public boolean salvarOuEditarReserva(Reserva reserva) {
		return reservaBusiness.salvarOuEditar(reserva);

	}

	@Override
	public Reserva buscarReservaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> getReserva() {
		return reservaBusiness.getAll();
	}
    
}
