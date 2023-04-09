package com.java.empmanagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection() {

        try {
            //Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Get connection
            String url = "jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
            String username = "root";
            String password = "Abcd@123";

            con = DriverManager.getConnection(url, username, password);
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        return con;
    }
}
