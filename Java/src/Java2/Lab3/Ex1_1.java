package Java2.Lab3;
import java.sql.*;

public class Ex1_1 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = conn.createStatement();
                ){
            String strSelect1= "Select * from books";
            System.out.println("The sql statement 1 is "+strSelect1);

            ResultSet rset = stmt.executeQuery(strSelect1);
            System.out.println("Results: ");
            int rowcount = 0;
            while (rset.next()){
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id+","+title+","+author+","+price+","+qty);
                ++rowcount;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
