package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dilaz
 */
public class Conexao {

    public Connection criarConecao() {
        String url = "jdbc:postgresql://localhost/mjv_db";
        String user = "postgres";
        String password = "0000";
        
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso no banco!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
