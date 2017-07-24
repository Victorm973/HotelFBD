
package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.projeto.entidades.Cliente;
import br.com.projeto.util.ConnectionFactory;
import br.com.projeto.util.SqlUtilCliente;

public class ClienteDao implements IClienteDao {

    Connection conexaoPost;
    PreparedStatement statment;
    ResultSet result;

    public ClienteDao() {
        try {
            conexaoPost = ConnectionFactory.getInstance(ConnectionFactory.TIPO_BASE_DADOS_POSTGRES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente salvar(Cliente cliente)throws Exception{

        try {
           
        	statment = conexaoPost.prepareStatement(SqlUtilCliente.INSERT_CLIENTE_ALL);
            statment.setString(1, cliente.getNome());
            statment.setString(2, cliente.getCpf());
            statment.setString(3, cliente.getIdentidade());
            statment.setString(4, cliente.getTelefone());
            statment.setString(5, cliente.getRua());
            statment.setString(6, cliente.getBairro());
            statment.setString(7, cliente.getCidade());
            statment.setString(8, cliente.getUf());
            statment.setString(9, cliente.getCep());

            statment.execute();
            
            statment = conexaoPost.prepareStatement(SqlUtilCliente.SELECT_CLIENTE_ULTIMO_REGISTRO);
            result = statment.executeQuery();
            
            result.next();
            cliente.setId(new Long(result.getInt("id")));
            return cliente;
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                conexaoPost.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }
             throw new Exception("Erro....");
  
    }

    @Override
    public boolean editar(Cliente cliente) {
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
