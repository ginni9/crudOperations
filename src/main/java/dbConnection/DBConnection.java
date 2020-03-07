package dbConnection;

import java.sql.*;

public class DBConnection {
    public Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;

    }
}
