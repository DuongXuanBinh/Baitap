package Java2.Lab3;
import java.sql.*;
public class Ex1_3 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = conn.createStatement();
                )
        {
            String str = "select title,price,qty from books where author=\'Codelean vn\' or price >= 30 order by price desc, id asc";
            ResultSet set= stmt.executeQuery(str);
            System.out.println("The statement is: "+str);
            int rowCount = 0;
            while(set.next()){
                String title = set.getString("title");
                double price = set.getDouble("price");
                int qty = set.getInt("qty");
                System.out.println(title+","+price+","+qty);
                ++rowCount;
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
