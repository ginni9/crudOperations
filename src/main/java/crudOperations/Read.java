package crudOperations;

import dbConnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {
    public static void readData(Connection connection,int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "Select * from employee where id=?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            System.out.println("Read Successful");
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("id: " + rs.getString("id"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println("city: " + rs.getString("city"));
                System.out.println("age: " + rs.getString("age"));
                System.out.println("deptName: " + rs.getString("deptName"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
