
package br.com.projeto.fachada;

import br.com.projeto.entidades.Acomodacao;
import br.com.projeto.entidades.Cliente;
import br.com.projeto.entidades.Reserva;
import br.com.projeto.entidades.Servico;
import br.com.projeto.entidades.VinculoClienteServico;

import java.util.List;


public interface ICoreFacade {
          
    public boolean salvarOuEditarCliente(Cliente cliente);
    public Cliente buscarClientePorCpf(String cpf);
    public List<Cliente> getClientes();
    
    public boolean salvarOuEditarServico(Servico servico);
    public Servico buscarServicoPorId(Long id);
    public List<Servico> getServico();
    
    public boolean salvarOuEditarVinculoClienteServico(VinculoClienteServico vinculo);
    public VinculoClienteServico buscarVinculoClienteServicoPorId(Long id);
    public List<VinculoClienteServico> getVinculoClienteServico();
    
    public boolean salvarOuEditarAcomodacao(Acomodacao acomodacao);
    public Servico buscarAcomodacaoPorId(Long id);
    public List<Servico> getAcomodacao();
    
    public boolean salvarOuEditarReserva(Reserva reserva);
    public Reserva buscarReservaPorId(Long id);
    public List<Reserva> getReserva();
}
