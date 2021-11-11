package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * View
 */
public class View {

    public static void main(String[] args) {
        try {
            String connectionString = "jdbc:postgresql://localhost:5434/postgres";
            String user = "postgres";
            String pwd ="123456";
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possivel conectar");
            //e.printStackTrace();
        }
    }
}