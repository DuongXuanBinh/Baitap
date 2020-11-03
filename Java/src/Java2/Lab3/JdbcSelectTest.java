package Java2.Lab3;
import java.sql.*;
public class JdbcSelectTest {
    public static void main(String[] args) {
        try (
            Connection coon=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
            Statement stmt = coon.createStatement();
        ){
            String strSelect ="Select title, price ,qty from books";
            System.out.println("The sql statement is:"+strSelect+"\n");

            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The seconds selected are: ");
            int rowcount = 0;
            while(rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ","+price+","+qty);
                ++rowcount;
            }
            System.out.println("Total number of records =" +rowcount);
        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }
}
