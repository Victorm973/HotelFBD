package br.com.projeto.util;

public class SqlUtilReserva {
	
	public static final String INSERT_RESERVA_ALL = "INSERT INTO Reserva(cpfCliente, idAcomodacao, inicioReserva, fimReserva) values (?, ?, ?, ?)";

	public static final String SELECT_RESERVA_ULTIMO_REGISTRO = "SELECT * FROM reserva ORDER BY id DESC LIMIT 1";

	public SqlUtilReserva() {
	}

}
