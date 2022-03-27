package dao;

import connectionsDB.pgAdminConnection;
import poco.Ipoco;

import java.sql.*;

public abstract class BaseDAO implements Idao {
    pgAdminConnection pgAdminConnection = new pgAdminConnection();
    protected Connection connection = null;
    protected Statement stm = null;

    protected void open() {
        connection = pgAdminConnection.getConnection();
        stm = pgAdminConnection.getStatement();
    }

    public  void closeAll(){
        try {
            connection.close();
            stm.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
