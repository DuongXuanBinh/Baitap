package Java2.Practice;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    String url = "jdbc:mysql://localhost:3306/Student";
    String username = "root";
    String password = "";

    public void displayStudent(List<Student> list){
        System.out.printf("%-30s%-30s%-30s%-30s\n","StudentID","Student Name","Address","Phone");
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i));
        }
    }
    public boolean updateToDB(List<Student> list){
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            String insert;
            int count = 0;
            for(int i = 0; i< list.size();i++){
                insert = "insert into student(studentID,studentName,address,phone) values('"+list.get(i).getStudentID()+"','"+list.get(i).getName()+"','"+list.get(i).getAddress()+"',"+list.get(i).getPhone()+")";
                count += stmt.executeUpdate(insert);
            }
            System.out.println(count + " row(s) affected");
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}