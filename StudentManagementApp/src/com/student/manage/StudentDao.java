package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {

      public static boolean insertStudent(Student student) {

            boolean flag = false;
            try {
                  // get connection
                  Connection conn = ConnProvider.createConnection();
                  // create query string
                  String query = "INSERT INTO students(sname,sphone,scity) values(?,?,?)";
                  // create prepared statement
                  PreparedStatement pstmt = conn.prepareStatement(query);
                  // set the values for parameters
                  pstmt.setString(1, student.getStudentName());
                  pstmt.setString(2, student.getStudentPhone());
                  pstmt.setString(3, student.getStudentCity());
                  // now execute
                  pstmt.executeUpdate();

                  flag = true;

            } catch (Exception e) {
                  e.printStackTrace();
            }

            return flag;
      }
}
