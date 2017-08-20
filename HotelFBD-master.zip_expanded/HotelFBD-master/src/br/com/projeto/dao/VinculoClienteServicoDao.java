package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projeto.entidades.Cliente;
import br.com.projeto.entidades.VinculoClienteServico;
import br.com.projeto.util.ConnectionFactory;
import br.com.projeto.util.SqlUtilVinculo;

public class VinculoClienteServicoDao implements IVinculoClienteServicoDao {

	Connection conexaoPost;
	PreparedStatement statment;
	ResultSet result;

	public VinculoClienteServicoDao() {
		try {
			conexaoPost = ConnectionFactory.getInstance(ConnectionFactory.TIPO_BASE_DADOS_POSTGRES);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public VinculoClienteServico salvar(VinculoClienteServico vinculo) throws Exception {

		try {
			statment = conexaoPost.prepareStatement(SqlUtilVinculo.INSERT_CLIENTE_SERVICO_ALL);
			statment.setString(1, vinculo.getCpfCliente());
			statment.setLong(2, vinculo.getIdServico());

			statment.execute();

			statment = conexaoPost.prepareStatement(SqlUtilVinculo.SELECT_CLIENTE_SERVICO_ULTIMO_REGISTRO);
			result = statment.executeQuery();

			result.next();
			vinculo.setId(new Long(result.getInt("id")));
			
			  JOptionPane.showMessageDialog(null, "Serviço Registrado!!!");
			
			return vinculo;

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
	public boolean editar(VinculoClienteServico vinculo) {
		// TODO Auto-generated method stub
		return false;
	}

	public VinculoClienteServico buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VinculoClienteServico> getAll(Cliente cliente) {

		try {

			statment = conexaoPost.prepareStatement(SqlUtilVinculo.SELECT_CLIENTE_SERVICO_SERVICONOME);
			statment.setString(1, cliente.getCpf());

			result = statment.executeQuery();

			List<VinculoClienteServico> servico = new ArrayList<VinculoClienteServico>();

			while (result.next()) {
				servico.add(new VinculoClienteServico(result.getString("s.nome"), result.getDouble("s.valor")));
			}

			result.close();

			return servico;

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
