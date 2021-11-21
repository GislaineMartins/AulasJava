package view;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 * View1
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class View1 {

    public static void main(String[] args) {
        try {
            String nome = "Eletro";

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/postgres", "postgres", "123456");
            PreparedStatement prepStatement = conn.prepareStatement("insert into categoria(nome) values(?)", Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            

            prepStatement.execute( );
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);             

            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
    }
}