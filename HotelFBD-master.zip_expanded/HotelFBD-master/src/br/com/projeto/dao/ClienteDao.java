
package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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


			if(!cliente.getCpf().equals("")){

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

				JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!!!");

				return cliente;

			}else{
				JOptionPane.showMessageDialog(null, "ERRO! \n Campos Vazios!!!");
			}



		} catch (Exception ex) {
			ex.printStackTrace();

			JOptionPane.showMessageDialog(null, "ERRO! \n CPF j� Cadastrado!!!");
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
		try {

			statment = conexaoPost.prepareStatement(SqlUtilCliente.UPDDATE_CLIENTE);

			statment.setString(1, cliente.getNome());
			statment.setString(2, cliente.getIdentidade());
			statment.setString(3, cliente.getTelefone());
			statment.setString(4, cliente.getRua());
			statment.setString(5, cliente.getBairro());
			statment.setString(6, cliente.getCidade());
			statment.setString(7, cliente.getUf());
			statment.setString(8, cliente.getCep());
			statment.setString(9, cliente.getCpf());

			statment.execute();

			JOptionPane.showMessageDialog(null, "Cliente Atualizado com Sucesso!!!");

			return true;


		} catch (Exception ex) {
			ex.printStackTrace();

			try {
				conexaoPost.rollback();
			} catch (SQLException ex1) {
				ex1.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Cliente buscarPorCpf(String cpf) {
		return null;
	}

	@Override
	public List<Cliente> getAll() {

		try {
			statment = conexaoPost.prepareStatement(SqlUtilCliente.SELECT_CLIENTE_ALL);

			result = statment.executeQuery();

			List<Cliente> cliente = new ArrayList<Cliente>();

			while(result.next()){
				cliente.add(new Cliente(result.getLong("id"), result.getString("nome"), result.getString("cpf"), result.getString("rg")
						, result.getString("telefone"), result.getString("rua"), result.getString("bairro"), result.getString("cidade"), result.getString("uf"), result.getString("cep")));
			}

			result.close();

			return cliente;	

		} catch (SQLException e) {
			e.printStackTrace();

			try {
				conexaoPost.rollback();
			} catch (SQLException ex1) {
				ex1.printStackTrace();
			}
		}


		return null;
	}

}
