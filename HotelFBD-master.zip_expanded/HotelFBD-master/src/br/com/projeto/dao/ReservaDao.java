package br.com.projeto.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

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
            
            statment.setDate(3, new Date(reserva.getInicioReserva().getTime()));
            statment.setDate(4, new Date(reserva.getFimReserva().getTime()));
            
            statment.execute();
           
            statment = conexaoPost.prepareStatement(SqlUtilReserva.SELECT_RESERVA_ULTIMO_REGISTRO);
            result = statment.executeQuery();
            
            result.next();
            reserva.setId(new Long(result.getInt("id")));
            
            JOptionPane.showMessageDialog(null, "Acomodação reservada com Sucesso!!!");
            
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
		try {
			statment = conexaoPost.prepareStatement(SqlUtilReserva.SELECT_RESEVA_ALL);

			ResultSet rs = statment.executeQuery();

			List<Reserva> reserva = new ArrayList<Reserva>();

			while(rs.next()){
				reserva.add(new Reserva(rs.getLong("id"), rs.getDate("data_inicio"), rs.getDate("data_termino"), rs.getLong("acomodacao_id"), rs.getString("cliente_cpf")));
			}

			rs.close();

			return reserva;	

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
