package br.com.projeto.util;

public class SqlUtilServico {
	
	public static final String INSERT_SERVICO_ALL = "INSERT INTO Servico(codigo, valor, descricao) values (?, ?, ?)";

	public static final String SELECT_SERVICO_ULTIMO_REGISTRO = "SELECT * FROM servico ORDER BY id DESC LIMIT 1";
	
    public static final String SELECT_SERVICO_ALL = "SELECT * from servico;";

    public static final String UPDDATE_SERVICO = "UPDATE servico set valor = ?, descricao = ? where id = (?);";

    
    private SqlUtilServico() {
    }

}
