package Java2.Lab3;

import java.sql.*;
import java.util.Scanner;

public class Test {
    private static String slt;
    private static ResultSet rst;

    private static Scanner input = new Scanner(System.in);
    public static void displayall() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement sttm = conn.createStatement();
        ) {
            slt = "Select * from product";
            rst = sttm.executeQuery(slt);
            System.out.println("result of the statement: " + slt);

            while (rst.next()) {
                int id = rst.getInt("id");
                String name = rst.getString("name");
                double price = rst.getDouble("price");
                System.out.println(id + "--" + name + "--" + price);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void searchbyname() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement sttm = conn.createStatement();
        ) {
            System.out.println("Enter name of product you want to find: ");
            String booksearch = input.next();
            slt = "select * from product where name like " + "\'%" + booksearch + "%\'";
            System.out.println("result of the statement: " + slt);
            rst = sttm.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("id");
                String name = rst.getString("name");
                double price = rst.getDouble("price");
                System.out.println(id + "--" + name + "--" + price);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
            int choice = 0;
            while(choice!=3){
                System.out.println("1. Display all\n" +
                        "2.Search by name\n" +
                        "3. Exit");
                System.out.println("Enter choice: ");
                choice = input.nextInt();
                switch (choice){
                    case 1:
                        displayall();
                        break;
                    case 2:
                        searchbyname();
                        break;
                    default:
                        break;
                }

            }
    }
}
