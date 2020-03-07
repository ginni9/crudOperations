package crudOperations;

import dbConnection.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Update {
    public static void updateData(Connection connection, ArrayList<String> details) {

        PreparedStatement ps=null;

        try {
            String query = "update employee set  id=?, name=?,city=?,age=?,deptName=? where id=?";
            ps=connection.prepareStatement(query);
            ps.setInt(1,Integer.parseInt(details.get(0)));
            ps.setString(2,details.get(1));
            ps.setString(3,details.get(2));
            ps.setInt(4,Integer.parseInt(details.get(3)));
            ps.setString(5,details.get(4));
            ps.setInt(6,Integer.parseInt(details.get(5)));


            System.out.println("Update Successful");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
