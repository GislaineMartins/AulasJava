package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class View3Delete {
    public static void main(String[] args) {
        try {
            
            int idDeletado = 10;
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
            
            String sql = "delete from categoria where id=?" ;
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setInt(1, idDeletado);
         

            prepStatement.execute(sql);
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
   
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
        
    }
    
}
