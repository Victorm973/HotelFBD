package br.com.projeto.util;

public class SqlUtilVinculo {

	public static final String INSERT_CLIENTE_SERVICO_ALL = "INSERT INTO ClienteServico(cpfCliente, idServico) values (?, ?)";

	public static final String SELECT_CLIENTE_SERVICO_ULTIMO_REGISTRO = "SELECT * FROM clienteServico ORDER BY id DESC LIMIT 1";
	
	public SqlUtilVinculo() {
	}

}
