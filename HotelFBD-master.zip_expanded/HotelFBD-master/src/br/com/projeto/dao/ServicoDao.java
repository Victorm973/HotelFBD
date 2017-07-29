package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.projeto.entidades.Servico;
import br.com.projeto.util.ConnectionFactory;
import br.com.projeto.util.SqlUtilServico;

public class ServicoDao implements IServicoDao {

	Connection conexaoPost;
    PreparedStatement statment;
    ResultSet result;

    public ServicoDao() {
        try {
            conexaoPost = ConnectionFactory.getInstance(ConnectionFactory.TIPO_BASE_DADOS_POSTGRES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Servico salvar(Servico servico)throws Exception{

        try {
        	
            statment = conexaoPost.prepareStatement(SqlUtilServico.INSERT_SERVICO_ALL);
            statment.setInt(1, servico.getCodigo());
            statment.setDouble(2, servico.getValor());
            statment.setString(3, servico.getDescricao());
            
            statment.execute();
           
            statment = conexaoPost.prepareStatement(SqlUtilServico.SELECT_SERVICO_ULTIMO_REGISTRO);
            result = statment.executeQuery();
            
            result.next();
            servico.setId(new Long(result.getInt("id")));
            
            JOptionPane.showMessageDialog(null, "Serviço Cadastrado com Sucesso!!!");

            
            return servico;
            
            
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
	public boolean editar(Servico servico) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Servico buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Servico> getAll() {
		try {
			statment = conexaoPost.prepareStatement(SqlUtilServico.SELECT_SERVICO_ALL);

			ResultSet rs = statment.executeQuery();

			List<Servico> servico = new ArrayList<Servico>();

			while(rs.next()){
				servico.add(new Servico(rs.getLong("id"), rs.getInt("codigo"), rs.getDouble("valor"), rs.getString("descricao")));
			}

			rs.close();

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
