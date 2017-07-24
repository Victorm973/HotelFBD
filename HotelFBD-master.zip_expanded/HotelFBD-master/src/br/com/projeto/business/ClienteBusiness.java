
package br.com.projeto.business;

import br.com.projeto.dao.ClienteDao;
import br.com.projeto.dao.IClienteDao;
import br.com.projeto.entidades.Cliente;
import java.util.List;

public class ClienteBusiness implements IClienteBusiness {

    private IClienteDao clienteDao;

    public ClienteBusiness() {
        this.clienteDao = new ClienteDao();
    }

    @Override
    public boolean salvarOuEditar(Cliente cliente) {
        try {
            if (cliente.getId() == null) {
                cliente = clienteDao.salvar(cliente);
                
                return true;
            }
            if (cliente.getId() != null) {
                clienteDao.editar(cliente);
                return true;
            }

        } catch (Exception e) {
                e.printStackTrace();
        }
        return false;

    }

    @Override
    public Cliente buscarPorCpf(String cpf) {
		return null;
    }

    @Override
    public List<Cliente> getAll() {
		return null;
    }

}
