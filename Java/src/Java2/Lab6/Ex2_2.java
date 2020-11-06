package Java2.Lab6;
import java.sql.*;
public class Ex2_2 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strupdate = "update customers set Address = '1A Yet Kieu - Ha Noi' where CustomerID = 'FRANK'";
            stmt.executeUpdate(strupdate);
            System.out.println("Updated the SQL statement: "+strupdate);

            String strselect = "Select * from customers where CustomerID = 'FRANK'";
            ResultSet rst = stmt.executeQuery(strselect);
            ResultSetMetaData rstMD = rst.getMetaData();
            for(int i =  1 ; i<rstMD.getColumnCount();i++){
                System.out.printf("%-30s",rstMD.getColumnName(i));
            }
            System.out.println();
            while (rst.next()){
                for(int i =1;i<rstMD.getColumnCount();i++){
                    System.out.printf("%-30s",rst.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

