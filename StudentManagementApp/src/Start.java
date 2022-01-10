import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

      public static void main(String[] args) {

            System.out.println("Welcome to Student Management Application....");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                  System.out.println("Add Student    => Press 1");
                  System.out.println("Delete Student => Press 2");
                  System.out.println("View Students  => Press 3");
                  System.out.println("Update Student => Press 4");
                  System.out.println("Exit App       => Press 5");

                  try {
                        int choice = Integer.parseInt(br.readLine());
                        if (choice == 1) {
                              // get credentials from user
                              System.out.println("Enter Student  Name: ");
                              String name = br.readLine();
                              System.out.println("Enter Student Phone: ");
                              String phone = br.readLine();
                              System.out.println("Enter Student  City: ");
                              String city = br.readLine();
                              // create a student object
                              Student student = new Student(name, phone, city);
                              boolean answer = StudentDao.insertStudent(student);

                              if (answer) {
                                    System.out.println("Success");
                              } else {
                                    System.out.println("Something Wrong");
                              }
                        } else if (choice == 2) {
                              // delete
                        } else if (choice == 3) {
                              // view
                        } else if (choice == 4) {
                              // update
                        } else {
                              break;
                        }
                  } catch (NumberFormatException e) {
                        e.printStackTrace();
                  } catch (IOException e) {
                        e.printStackTrace();
                  }
            }
            System.out.println("Thank you for using my App...........");
      }

}
