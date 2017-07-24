package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.projeto.entidades.Acomodacao;
import br.com.projeto.util.ConnectionFactory;
import br.com.projeto.util.SqlUtilAcomodacao;

public class AcomodacaoDao implements IAcomodacaoDao {

	Connection conexaoPost;
    PreparedStatement statment;
    ResultSet result;

    public AcomodacaoDao() {
        try {
            conexaoPost = ConnectionFactory.getInstance(ConnectionFactory.TIPO_BASE_DADOS_POSTGRES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Acomodacao salvar(Acomodacao acomodacao)throws Exception{

        try {
            statment = conexaoPost.prepareStatement(SqlUtilAcomodacao.INSERT_ACOMODACAO_ALL);
            statment.setInt(1, acomodacao.getNumero());
            statment.setDouble(2, acomodacao.getValor_diaria());
            statment.setString(3, acomodacao.getDescricao());
            statment.setBoolean(4, acomodacao.isDisponivel());
            
            statment.execute();
           
            statment = conexaoPost.prepareStatement(SqlUtilAcomodacao.SELECT_ACOMODACAO_ULTIMO_REGISTRO);
            result = statment.executeQuery();
            
            result.next();
            acomodacao.setId(new Long(result.getInt("id")));
            return acomodacao;
            
            
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
	public boolean editar(Acomodacao acomodacao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Acomodacao buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Acomodacao> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
