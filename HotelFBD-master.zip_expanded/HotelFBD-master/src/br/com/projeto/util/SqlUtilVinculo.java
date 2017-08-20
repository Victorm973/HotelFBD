package br.com.projeto.util;

public class SqlUtilVinculo {

	public static final String INSERT_CLIENTE_SERVICO_ALL = "INSERT INTO ClienteServico(cpfCliente, idServico) values (?, ?)";

	public static final String SELECT_CLIENTE_SERVICO_ULTIMO_REGISTRO = "SELECT * FROM clienteServico ORDER BY id DESC LIMIT 1";
	
	public static final String SELECT_CLIENTE_SERVICO_SERVICONOME = "SELECT s.nome, s.valor FROM clienteServico INNER JOIN Cliente on cpfCliente = Cliente.cpf INNER JOIN Servico s on idServico = s.id where (Cliente.cpf = ?);";
	
	public SqlUtilVinculo() {
	}

}
