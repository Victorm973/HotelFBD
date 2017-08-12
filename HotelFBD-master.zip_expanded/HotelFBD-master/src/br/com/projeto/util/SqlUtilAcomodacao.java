package br.com.projeto.util;

public class SqlUtilAcomodacao {
	
	public static final String INSERT_ACOMODACAO_ALL = "INSERT INTO Acomodacao(numero, valor_diaria, descricao, disponivel) values (?, ?, ?, ?)";

	public static final String SELECT_ACOMODACAO_ULTIMO_REGISTRO = "SELECT * FROM acomodacao ORDER BY id DESC LIMIT 1";
	
	public static final String SELECT_ACOMODACAO_ALL = "SELECT * from acomodacao;";
	
    public static final String UPDDATE_ACOMODACAO = "UPDATE acomodacao set numero = ?, valor_diaria = ?, descricao = ? where id = (?);";


	public SqlUtilAcomodacao() {
	}

}
