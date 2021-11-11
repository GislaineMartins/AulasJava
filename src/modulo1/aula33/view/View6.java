package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View6 {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM pessoa WHERE id=5";   
            statement.execute(sql);
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
        
    }
    
}
