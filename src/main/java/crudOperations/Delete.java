package crudOperations;

import dbConnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete {
    public static void deleteData(Connection connection,int id) {
        PreparedStatement ps = null;
        try {
            String query = "delete from employee where id=?";
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            System.out.println("Record Deleted");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
