package Java2.Lab3;
import java.sql.*;
public class Ex1_2 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = conn.createStatement();
                )
        {
            String str = "select title, price from books where author = \'Codelean vn\'";
            System.out.println("The statement is: "+str);
            ResultSet rs= stmt.executeQuery(str);
            int rowCount = 0;
            while (rs.next()){
                String title = rs.getString("title");
                double price = rs.getDouble("price");
                System.out.println(title+","+price);
                ++rowCount;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
