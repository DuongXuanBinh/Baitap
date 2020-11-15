package Java2.Lab9.Answer.Controllers;

import Java2.Lab9.Answer.Models.Order;
import Java2.Lab9.Answer.Models.OrderDetail;
import Java2.Lab9.Answer.Models.User;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class OrderDetailController {
    String url = "jdbc:mysql://localhost:3306/ebookstore";
    String username = "root";
    String password = "";
    List<OrderDetail> orderDetailList = new ArrayList<>();
    public List<OrderDetail> loading() {
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from orderdetail";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()) {
                int Oid = rset.getInt("orderID");
                int Bid = rset.getInt("bookID");
                String title = rset.getString("title");
                int amount = rset.getInt("amount");
                double price = rset.getDouble("price");
                String createddate = rset.getString("createddate");
                String updateddate = rset.getString("updateddate");
                OrderDetail obj = new OrderDetail(Oid, Bid,title,amount,price, createddate, updateddate);
                orderDetailList.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return orderDetailList;
    }

    public void displayOrderDetail(User user){
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {
            String slt = "Select orderdetail.orderID,bookID,title,amount,price,orderdetail.createddate,orderdetail.updateddate from orderdetail inner join orders on orderdetail.orderID = orders.orderID where orders.customerID =" + user.getId() + " AND orders.orderdate = CURRENT_DATE()";
            ResultSet rst = stmt.executeQuery(slt);
            ResultSetMetaData rset = rst.getMetaData();
            int column = rset.getColumnCount();
            for (int i = 1; i <= column; i++) {
                System.out.printf("%-30s", rset.getColumnName(i));
            }
            System.out.println();
            while (rst.next()) {
                for (int i = 1; i <= column; i++) {
                    System.out.printf("%-30s", rst.getString(i));
                }
                System.out.println();
            }
            System.out.println("============================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
