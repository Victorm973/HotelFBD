
package br.com.projeto.util;

public class SqlUtilCliente {

    
    public static final String INSERT_CLIENTE_ALL = "INSERT INTO Cliente(nome, cpf, rg, telefone, rua, bairro, cidade, uf, cep) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    public static final String SELECT_CLIENTE_ULTIMO_REGISTRO = "SELECT * FROM cliente ORDER BY id DESC LIMIT 1";
    
    
    private SqlUtilCliente() {
    }
    
    
    
    
}
