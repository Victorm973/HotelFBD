package br.com.projeto.util;

public class SqlUtilVinculo {

	public static final String INSERT_CLIENTE_SERVICO_ALL = "INSERT INTO vincclienteservico(cliente_cpf, servico_id) values (?, ?)";

	public static final String SELECT_CLIENTE_SERVICO_ULTIMO_REGISTRO = "SELECT * FROM vincclienteservico ORDER BY id DESC LIMIT 1";
	
	public static final String SELECT_CLIENTE_SERVICO_SERVICONOME = "SELECT s.nome, s.valor FROM vincclienteservico INNER JOIN Cliente on cliente_cpf = Cliente.cpf INNER JOIN Servico s on servico_id = s.id where (Cliente.cpf = ?);";
	
	public SqlUtilVinculo() {
	}

}
