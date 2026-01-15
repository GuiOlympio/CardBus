package modal.Dao;

import connection.Conexao;
import java.sql.PreparedStatement;

public class AlunosDAO {
    
    public void create(){
        
        Conexao con = (Conexao) Conexao.getCennection();
        PreparedStatement pstm = null;
        
        try{
            pstm = con.prepareStatement("");
            
            
        } catch (Exception e){
            
        }
        
    }
}
