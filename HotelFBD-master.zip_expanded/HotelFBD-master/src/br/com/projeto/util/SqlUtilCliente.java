
package br.com.projeto.util;

public class SqlUtilCliente {

    
    public static final String INSERT_CLIENTE_ALL = "INSERT INTO Cliente(nome, cpf, rg, telefone, rua, bairro, cidade, uf, cep) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    public static final String SELECT_CLIENTE_ULTIMO_REGISTRO = "SELECT * FROM cliente ORDER BY id DESC LIMIT 1";
    
    public static final String SELECT_CLIENTE_ALL = "SELECT * from cliente;";
    
    public static final String SELECT_CLIENTE_CPF = "SELECT * from cliente where cpf = (?);";
    
    public static final String UPDDATE_CLIENTE = "UPDATE cliente set nome = ?, rg = ?, telefone = ?, rua = ?, bairro = ?, cidade = ?, uf = ?, cep = ? where cpf = (?);";

    
    private SqlUtilCliente() {
    }
    
    
    
    
}
