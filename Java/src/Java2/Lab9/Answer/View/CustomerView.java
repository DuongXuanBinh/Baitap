package Java2.Lab9.Answer.View;

import Java2.Lab9.Answer.Controllers.*;
import Java2.Lab9.Answer.Models.*;
import Java2.Lab9.Answer.Controllers.*;

import java.sql.*;
import java.util.*;


public class CustomerView {
    Scanner input = new Scanner(System.in);
    public  String slt;
    public  ResultSet rst;


    public  void customerManagement(User user) {
        int choice;
        BookShop bookShop = new BookShop();
        do {
            System.out.println("1. Add new customer\n" +
                    "2. Update customer \n" +
                    "3. Delete customer\n" +
                    "4. Display all Customers\n" +
                    "5. Display all Users\n" +
                    "6. Back");
            System.out.println("Your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addCus(user);
                    break;
                case 2:
                    updateCus();
                    break;
                case 3:
                    deleteCus();
                    break;
                case 4:
                    CustomerController cus = new CustomerController();
                    cus.displayCustomer();
                    break;
                case 5:
                    Register reg = new Register();
                    reg.displayUser();
                    break;
                case 6:
                    bookShop.menuAdmin(user);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 6);
    }

    public boolean addCus(User user) {
        UserController ctr = new UserController();
        CustomerController cus = new CustomerController();
        List<User> list = ctr.loading();
        int i = list.size()-1;
        int id = list.get(i).getId();
        System.out.println("(SignUp)Enter customer name: ");
        String name = input.nextLine();
        System.out.println("(SignUp)Enter customer address: ");
        String address = input.nextLine();
        int j = 0;
        String email;
        do {
            System.out.println("(SignUp)Enter customer email: ");
            email = input.nextLine();
            j = cus.checkEmail(email);
            if(j!=1){
                System.out.println("This email already exists. Enter another email!");;
            }
        }while (j!=1);

        String phone;
        do {
            System.out.println("(SignUp)Enter customer phone: ");
            phone = input.nextLine();
            j=cus.checkPhone(phone);
            if(j!=1){
                System.out.println("This phone number already exists. Enter another phone number!");;
            }
        }while (j!=1);
        int member = 4;
        Customer obj = new Customer(id, name, address, email, phone, member);
        CustomerController ctrl = new CustomerController();
        ctrl.insertCustomer(obj);
        return true;
    }

    public void updateCus() {
        Customer obj = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id you want to update:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter new address: ");
        String address = input.nextLine();
        System.out.println("Enter new email: ");
        String email = input.nextLine();
        System.out.println("Enter new phone: ");
        String phone = input.nextLine();
        obj.setAddress(address);
        obj.setCustomerID(id);
        obj.setEmail(email);
        obj.setPhone(phone);
        CustomerController ctr = new CustomerController();
        if (ctr.updateCustomer(obj) == 0) {
            System.out.println("No customer found");
        } else if (ctr.updateCustomer(obj) == 1) {
            System.out.println("Customer has been updated");
        }
    }

    public void deleteCus() {
        Customer obj = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id you want to delete:");
        int id = Integer.parseInt(input.nextLine());
        obj.setCustomerID(id);
        CustomerController ctr = new CustomerController();
        ctr.deleteCustomer(obj);
    }

    public  void cusInfor(User user) {
        int x = user.getId();
        CustomerController cus = new CustomerController();
        cus.display1Customer(x);
    }

    public  void cusOrder(User user) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            int x = user.getId();
            String select = "Select * from orders where customerID = " + x;
            ResultSet rset = stmt.executeQuery(select);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; i++) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public  void cusOrderDetail(User user) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            int x = user.getId();
            String select = "Select orderdetail.orderID,bookID,title,amount,price,orders.orderdate,orders.status  from orderdetail inner join orders on orderdetail.orderID = orders.orderID" +
                    " inner join customers on customers.customerID = orders.customerID where customers.customerID = " + x;
            ResultSet rset = stmt.executeQuery(select);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; i++) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}