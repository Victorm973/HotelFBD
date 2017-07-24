package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.projeto.entidades.Reserva;
import br.com.projeto.util.ConnectionFactory;
import br.com.projeto.util.SqlUtilReserva;

public class ReservaDao implements IReservaDao {

	Connection conexaoPost;
    PreparedStatement statment;
    ResultSet result;

    public ReservaDao() {
        try {
            conexaoPost = ConnectionFactory.getInstance(ConnectionFactory.TIPO_BASE_DADOS_POSTGRES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Reserva salvar(Reserva reserva)throws Exception{

        try {
            statment = conexaoPost.prepareStatement(SqlUtilReserva.INSERT_RESERVA_ALL);
            statment.setString(1, reserva.getCpfCliente());
            statment.setLong(2, reserva.getIdAcomodacao());
            statment.setDate(3, (Date) reserva.getInicioReserva());
            statment.setDate(4, (Date) reserva.getFimReserva());
            statment.setString(5, reserva.getCpfCliente());
            
            statment.execute();
           
            statment = conexaoPost.prepareStatement(SqlUtilReserva.SELECT_RESERVA_ULTIMO_REGISTRO);
            result = statment.executeQuery();
            
            result.next();
            reserva.setId(new Long(result.getInt("id")));
            return reserva;
            
            
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
	public boolean editar(Reserva reserva) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reserva buscarPorid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reserva> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
