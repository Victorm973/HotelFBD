
package br.com.projeto.business;

import br.com.projeto.entidades.Cliente;
import java.util.List;

public interface IClienteBusiness {
      
    public boolean salvarOuEditar(Cliente cliente);
    public Cliente buscarPorCpf(String cpf);
    public List<Cliente> getAll();
}
