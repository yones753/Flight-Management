package connectionsDB;

import java.sql.*;

public class pgAdminConnection {
     Connection connection = null;
     Statement stm = null;

    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Flights", "postgres", "Yones12!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public Statement getStatement() {
        try {
            stm = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stm;
    }

}
