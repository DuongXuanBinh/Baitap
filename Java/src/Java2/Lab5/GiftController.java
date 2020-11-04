package Java2.Lab5;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftController {
    static List<Gift> listObj = new ArrayList<>();
    static int i = 0;

    public static void main(String[] args) {
        loading();
        select();
    }
    //Luu du lieu vao object
    public static void loading() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String stt = "Select * from books";
            ResultSet rset = stmt.executeQuery(stt);
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
    }
    // select thong qua object
    public static void select() {
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
            System.out.println();
            for (int i = 0; i < listObj.size(); i++) {
                System.out.printf("%-30d%-30s%-30s%-30.2f%-30d\n", listObj.get(i).getId(), listObj.get(i).getName(), listObj.get(i).getAuthor(), listObj.get(i).getPrice(), listObj.get(i).getQty());
            }
            System.out.printf("There are %d records\n",listObj.size());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void insert(Gift gift) {
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

    public static void delete() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            System.out.println("Enter id of book you want to delete: ");
            Scanner input = new Scanner(System.in);
            int id = input.nextInt();
            int i = 0;

            for(i =0;i<listObj.size();i++){
                if(listObj.get(i).getId()==id){
                    listObj.remove(i);
                }
            }
            String delete = "delete from books where id ="+id;
            stmt.executeUpdate(delete);
            System.out.printf("Deleted %d record(s)",i);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
