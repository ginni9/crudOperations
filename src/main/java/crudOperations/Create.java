package crudOperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Create {
    public static void createData(Connection connection, ArrayList<String>details) {
        PreparedStatement ps=null;

        try {
            String query = "insert into employee(id,name,city,age,deptName) values (?,?,?,?,?)";
            ps=connection.prepareStatement(query);
            ps.setInt(1,Integer.parseInt(details.get(0)));
            ps.setString(2,details.get(1));
            ps.setString(3,details.get(2));
            ps.setInt(4,Integer.parseInt(details.get(3)));
            ps.setString(5,details.get(4));

            ps.executeUpdate();
            System.out.println("Record Created");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
