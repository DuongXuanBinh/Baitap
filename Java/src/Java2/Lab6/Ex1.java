package Java2.Lab6;
import java.sql.*;
public class Ex1 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strupdate = "update books set price = price * 1.5 where title like '%a cup of java%'";
            stmt.executeUpdate(strupdate);
            System.out.println("Updated the SQL statement: "+strupdate);

            strupdate = "update books set qty = 0 where name like '%a teaspoon of java%'";
            stmt.executeUpdate(strupdate);
            System.out.println("Updated the SQL statement: "+strupdate);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
