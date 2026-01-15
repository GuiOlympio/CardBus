/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Conexao {
    
    private static final String url = "jdbc:postgresql://localhost:5432/dbcarteiraOnibus";
    private static final String user = "postgresql";
    private static final String senha = " ";
    
    
    public static Connection getCennection(){
       
        Connection con = null;
        
        try {
            
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,user,senha);
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro de Conexão!!");
        }
        return con;
    }
    
    public static void fxConexao(Connection con){
        
        try{
            if (con != null){
                con.close();
            }
        }catch (SQLException e ){
            System.out.println("Erro so fechar Conexão: "+ e.getMessage());
        }
    }
    public static void fxConexao(Connection con, PreparedStatement pstm){
        
        fxConexao(con);
        try{
            if (pstm != null){
                pstm.close();
            }
        }catch (SQLException e ){
            System.out.println("Erro ao fechar PreparedStatement: "+ e.getMessage());
        }
    }
    public static void fxConexao(Connection con, PreparedStatement pstm, ResultSet rs ){
        
        fxConexao(con,pstm);
        try{
            if (rs != null){
                rs.close();
            }
        }catch (SQLException e ){
            System.out.println("Erro de Conexão: "+ e.getMessage());
        }
    }
}
