package crudController;

import crudOperations.Create;
import crudOperations.Delete;
import crudOperations.Read;
import crudOperations.Update;
import dbConnection.DBConnection;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class CRUDController {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        char ch;
        do {
            System.out.println("Enter type of operation:" + " " + "1:Create" + " " + "2:Read" + " " + "3:Update" + " " + "4:Delete");
            Scanner ob = new Scanner(System.in);
            int choice = ob.nextInt();
            ArrayList<String> details=new ArrayList<String>();
            switch (choice) {
                case 1: {
                    System.out.println("Enter id,name,city,age,deptName in order");
                    for (int i = 0; i < 5; i++) {
                        details.add(ob.next());
                    }
                    Create.createData(connection, details);
                    break;

                }
                case 2: {
                    System.out.println("Enter id");
                    int id = ob.nextInt();
                    Read.readData(connection,id);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter new id,name,city,age,deptName,id in order");
                    for(int i=0;i<6;i++)
                    {
                        details.add(ob.next());
                    }
                    Update.updateData(connection,details);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter id");
                    int id = ob.nextInt();
                    Delete.deleteData(connection,id);
                    break;

                }
            }
            details.removeAll(details);
            System.out.println("Press n to discontinue");
            ch = ob.next().charAt(0);
        }

        while (ch != 'n');

    }
}
