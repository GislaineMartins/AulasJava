package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class View2Update {
    public static void main(String[] args) {
        try {
            String nome = "UpdatePreparestatement";
            int id = 10;
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
            
            String sql = "update categoria set nome = '?' where id = ?" ;
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id);

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
