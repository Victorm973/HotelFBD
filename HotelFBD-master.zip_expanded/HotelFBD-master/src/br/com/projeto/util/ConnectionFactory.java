
package br.com.projeto.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static final String TIPO_BASE_DADOS_POSTGRES = "POSTGRESS";

    public static final String URL_POSTGRES = "jdbc:postgresql://localhost:5432/HotelFBD";
    public static final String LOGIN_POSTGRES = "postgres";
    public static final String SENHA_POSTGRES = "ned,1995";

    private static Connection conPost;

    private ConnectionFactory() {

    }

    public static Connection getInstance(String tipoBaseDados) {
        try {
            switch (tipoBaseDados) {

                case TIPO_BASE_DADOS_POSTGRES:
                    if (conPost == null || conPost.isClosed()) {
                        conPost = getConnection(URL_POSTGRES, LOGIN_POSTGRES, SENHA_POSTGRES);
                    }
                    return conPost;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    private static Connection getConnection(String url, String login, String senha) {
        try {
            return DriverManager.getConnection(url, login, senha);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
