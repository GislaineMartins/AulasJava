package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class View2 {
public static void main(String[] args) {
    try {
        String driveType = "jdbc";
        String driverName = "postgresql";
        String host = "localhost";
        int port = 5434;
        String database = "postgres";

        String connectionString = String.format("%s:%s://%s:%d/%s", driveType, driverName, host,port,database);
       // String connectionString = "jdbc:postgresql://localhost:5434/postgres";
        String user = "postgres";
        String pwd ="123456";
        Connection conn = DriverManager.getConnection(connectionString, user, pwd);

        conn.close();
    } catch (SQLException e) {
        System.out.println("Não foi possivel conectar");
    }
}
}
 

