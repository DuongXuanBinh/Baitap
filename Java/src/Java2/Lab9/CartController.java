package Java2.Lab9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CartController {
    public Cart getItem(Book book){
        Cart obj = new Cart();
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from books where bookID = "+book.getBookID();
            ResultSet rset = stmt.executeQuery(select);
            System.out.printf("%-30s%-30s%-30s%-30s%-30s","bookID","title","price","qty","discount");
            System.out.println();
            while(rset.next()){
                int id = rset.getInt("bookID");
                String title= rset.getString("title");
                double price = rset.getDouble("price");
                obj = new Cart(id,title,price,book.getQty());
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return obj;
    }
}
