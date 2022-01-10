package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnProvider {

      static Connection conn;

      public static Connection createConnection() {

            try {
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  String user = "javaUser";
                  String password = "F7361i10350";
                  String url = "jdbc:mysql://localhost:3306/student_manage?autoReconnect=true&useSSL=false";

                  conn = DriverManager.getConnection(url, user, password);
                  System.out.println("Connection Created");

            } catch (Exception e) {
                  e.printStackTrace();
            }
            return conn;
      }

}
