package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
public class Conexao {
    
    private final String url = "jdbc:postgresql//localhost:5432/dbCardBus";
    private final String user = "postgresql";
    private final String senha = " ";
    
    public Connection getConexao(){
        Connection con = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            
            con = DriverManager.getConnection(url, user, senha);
            
            
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Falha de Conexão: " + e.getMessage());
        }
        
        return con;
    }
}