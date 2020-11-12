package Java2.Lab8;

import java.sql.Connection;
import java.sql.*;

public class JdbcCommitCatchTest {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
             Statement stmt = conn.createStatement();
        ) {
            try{
                conn.setAutoCommit(false);
                stmt.executeUpdate("insert into books values(4001,'Paul Chan','Mahjong 101',4.4,4)");
                conn.commit();
                stmt.executeUpdate("insert into books values (4001,'Peter Chan','Mahjong 102',4.4,4)");
                conn.commit();
            }catch (SQLException ex) {
                System.out.println("---Rolling back changes---");
                ex.printStackTrace();
                conn.rollback();
            }
        }
    }
}
