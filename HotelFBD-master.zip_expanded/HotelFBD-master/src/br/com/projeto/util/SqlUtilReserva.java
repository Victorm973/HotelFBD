package br.com.projeto.util;

public class SqlUtilReserva {
	
	public static final String INSERT_RESERVA_ALL = "INSERT INTO Reserva(cliente_cpf, acomodacao_id, data_inicio, data_termino) values (?, ?, ?, ?)";

	public static final String SELECT_RESERVA_ULTIMO_REGISTRO = "SELECT * FROM reserva ORDER BY id DESC LIMIT 1";
	
    public static final String SELECT_RESEVA_ALL = "SELECT * from reserva;";

    public static final String UPDDATE_RESERVA = "UPDATE reserva set data_inicio = ?, data_termino = ?, acomodacao_id = ? where id = (?);";


	public SqlUtilReserva() {
	}

}
