package Java2.Lab5;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftController {
    List<Gift> listObj = new ArrayList<>();
    int i = 0;

    public static void main(String[] args) {
    }
    //Luu du lieu vao object
    public List<Gift> loading() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String stt = "Select * from books";
            ResultSet rset = stmt.executeQuery(stt);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();
            for (int i = 1; i <= numColums; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            while (rset.next()) {
                Gift obj = new Gift();
                obj.setId(rset.getInt("id"));
                obj.setName(rset.getString("title"));
                obj.setAuthor(rset.getString("author"));
                obj.setPrice(rset.getDouble("price"));
                obj.setQty(rset.getInt("qty"));
                listObj.add(i, obj);
                ++i;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listObj;
    }
    // select thong qua object
//    public List<Gift> select() {
//        try (
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
//                Statement stmt = conn.createStatement();
//        ) {
//            String stt = "Select * from books";
//            ResultSet rset = stmt.executeQuery(stt);
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return listObj;
//    }

    public void insert(Gift gift) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String insert = "insert into books values("+gift.getId()+",'"+gift.getName()+"',"+"'"+gift.getAuthor()+"',"+gift.getPrice()+","+gift.getQty()+")";
            stmt.executeUpdate(insert);
            System.out.println("Successfully added");
            listObj.add(gift);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(Gift gift) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String delete = "delete from books where id ="+gift.getId();
            stmt.executeUpdate(delete);
            System.out.println("Deleted successfully");
            listObj.removeIf(n->n.getId()== gift.getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
