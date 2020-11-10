package Java2.Lab7;

import Java.Lab9.B;
import Java.Lab9.C;

import java.sql.*;
import java.util.Scanner;

public class view {
    Scanner scanner = new Scanner(System.in);
    public static String slt;
    public static ResultSet rst;

    public static void main(String[] args) {
        System.out.println("Welcome to E-bookstore!!!");
        System.out.println("============================================================");
        menu();
    }
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Sign In\n" +
                    "2. Sign Up\n" +
                    "3. Visit mode\n" +
                    "4. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Register reg = new Register();
                    User user = reg.signIn();
                    checkUser(user);
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    menuVisit();
                    break;
                case 4:
                    System.out.println("Goodbye! See you later");
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }
    public static void menuCustomer(User user) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Display your information\n" +
                    "2. Display your order\n" +
                    "3. Display your order detail\n" +
                    "4. Display books in store\n" +
                    "5. Find book by category\n" +
                    "6. Find book by Author\n" +
                    "7. Find book by Category\n" +
                    "8. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cusInfor(user);
                    break;
                case 2:
                    cusOrder(user);
                    break;
                case 3:
                    cusOrderDetail(user);
                    break;
                case 4:
                    BookController bookctrl = new BookController();
                    bookctrl.displayBook();
                    break;
                case 5:
                    findBookByCategory();
                    break;
                case 6:
                    findBookByAuthor();
                    break;
                case 7:
                    findBookByID();
                    break;
                case 8:
                    menu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 8);
    }
    public static void menuAdmin(User user) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Book management\n" +
                    "2. Customer management\n" +
                    "3. Order management\n" +
                    "4. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookManagement(user);
                    break;
                case 2:
                    customerManagement(user);
                    break;
                case 3:
                    orderDetail();
                    break;
                case 4:
                    menu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 4);
    }

    private static void menuVisit() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println(
                    "1. Display books in store\n" +
                    "2. Find book by category\n" +
                    "3. Find book by Author\n" +
                    "4. Find book by Category\n" +
                            "5. Top 10 newest books\n" +
                            "6. Top seller" +
                    "7. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    BookController bookctrl = new BookController();
                    bookctrl.displayBook();
                    break;
                case 2:
                    findBookByCategory();
                    break;
                case 3:
                    findBookByAuthor();
                    break;
                case 4:
                    findBookByID();
                    break;
                case 5:
                    top10newest();
                    break;
                case 6:
                    topSeller();
                    break;
                case 7:
                    menu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 8);

    }

//    public static void bookDetail() {
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("1. Display the 10 newest books\n" +
//                    "2. Top 10 seller\n" +
//                    "3. Display books by category\n" +
//                    "4. Display books by author\n" +
//                    "5. Display books by ID\n" +
//                    "6. Back");
//            System.out.println("Your choice:");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    top10newest();
//                    break;
//                case 2:
//                    topSeller();
//                    break;
//                case 3:
//                    findBookByCategory();
//                    break;
//                case 4:
//                    findBookByAuthor();
//                    break;
//                case 5:
//                    findBookByID();
//                    break;
//                case 6:
//                    menuAdmin();
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//                    break;
//            }
//        } while (choice != 6);
//    }
    public static void top10newest() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "SELECT * FROM books order by years limit 10";
            rst = stmt.executeQuery(slt);
            System.out.println("THE 10 NEWEST BOOKS:");
            System.out.println("=============================================================================================================");
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String years = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\n", id, title, author, years, genre, status, qty, price);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**");
            System.out.println("=============================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void topSeller() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "select books.bookID,books.title,author,years,genre,books.status,qty,books.price,sum(orderdetail.amount) as soldamount from books inner join orderdetail on books.bookID = orderdetail.bookID inner join orders on orders.orderID = orderdetail.orderID" +
                    " where orders.status != 0 group by books.bookID,books.title,author,years,genre,books.status,qty,books.price order by soldamount DESC limit 10";
            rst = stmt.executeQuery(slt);
            System.out.println("TOP 10 SELLER:\n" +
                    "====================================================================================================================================");
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice\tsoldamount");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String year = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                int soldamount = rst.getInt("soldamount");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\t\t%-6d\n", id, title, author, year, genre, status, qty, price, soldamount);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**\n" +
                    "====================================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void orderDetail() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. New confirmed order\n" +
                    "2. Display order by Customer ID\n" +
                    "3. Display order by order ID\n" +
                    "4. Display order detail by order ID\n" +
                    "5. Display pending order\n" +
                    "6. Display ready order\n" +
                    "7. Display delivering order\n" +
                    "8. Display delivered order\n" +
                    "9. Display canceled order\n" +
                    "0. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Back to menu. Please wait...");
                    break;
                case 1:
                    displayOrderByStatus(1);
                    break;
                case 2:
                    displayOrderByCustomerID();
                    break;
                case 3:
                    displayOrderByOrderID();
                    break;
                case 4:
                    OrderDetailByOrderID();
                    break;
                case 5:
                    displayOrderByStatus(2);
                    break;
                case 6:
                    displayOrderByStatus(3);
                    break;
                case 7:
                    displayOrderByStatus(4);
                    break;
                case 8:
                    displayOrderByStatus(5);
                    break;
                case 9:
                    displayOrderByStatus(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);
    }
    public static void findBookByCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the category: (1-Fiction,2-Science,3-Literature)");
        int cat = scanner.nextInt();
        System.out.println("===========================================================================================================================");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "SELECT bookID,title,author,years,books.genre,status,qty,price FROM books inner join category on category.genre = books.genre where books.genre =" + cat;
            rst = stmt.executeQuery(slt);
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String years = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\n", id, title, author, years, genre, status, qty, price);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**");
            System.out.println("===========================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void findBookByAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author's name:");
        String authors = scanner.nextLine();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "SELECT bookID,title,author,years,books.genre,status,qty,price FROM books where author like \'%" + authors + "%\'";
            rst = stmt.executeQuery(slt);
            System.out.println("===============================================================================================================================");
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String years = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\n", id, title, author, years, genre, status, qty, price);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**\n" +
                    "===============================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void findBookByID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book's ID:");
        int bookid = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "SELECT bookID,title,author,years,books.genre,status,qty,price FROM books where bookID = " + bookid;
            rst = stmt.executeQuery(slt);
            System.out.println("====================================================================================================================================");
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String years = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\n", id, title, author, years, genre, status, qty, price);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**\n" +
                    "====================================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void displayOrderByStatus(int stt) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            switch (stt) {
                case 0:
                    System.out.println("Canceled Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                case 1:
                    System.out.println("Confirmed Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                case 2:
                    System.out.println("Pending Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                case 3:
                    System.out.println("Ready Order(s) \n" +
                            "===========================================================================================================================");
                    break;
                case 4:
                    System.out.println("Delivering Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                case 5:
                    System.out.println("Delivered Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                default:
                    break;
            }
            System.out.println("orderID\t\tcustomerID\t\tdiscount\t\ttotal\t\torderdate\t\tstatus");
            slt = "Select orderID,customerID,discount,total,orderdate,status from orders where status = " + stt;
            rst = stmt.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("orderID");
                int cusID = rst.getInt("customerID");
                int discount = rst.getInt("discount");
                double total = rst.getDouble("total");
                String orderdate = rst.getString("orderdate");
                int status = rst.getInt("status");
                System.out.printf("%-6d\t\t%-8d\t\t%-8d\t\t%-6.1f\t\t%-12s\t%-6d\n", id, cusID, discount, total, orderdate, status);
            }
            System.out.println("===========================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void displayOrderByCustomerID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer ID: ");
        int cusid = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            System.out.println("==================================================================================================");
            System.out.println("orderID\t\tcustomerID\t\tdiscount\t\ttotal\t\torderdate\t\tstatus");
            slt = "Select orderID,customerID,discount,total,orderdate,status from orders where customerID =" + cusid;
            rst = stmt.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("orderID");
                int cusID = rst.getInt("customerID");
                int discount = rst.getInt("discount");
                double total = rst.getDouble("total");
                String orderdate = rst.getString("orderdate");
                int status = rst.getInt("status");
                System.out.printf("%-6d\t\t%-8d\t\t%-8d\t\t%-6.1f\t\t%-12s\t%-6d\n", id, cusID, discount, total, orderdate, status);
            }
            System.out.println("**Status: 0-Canceled, 1-Confirmed, 2-Pending,3-Ready,4-Delivering,5-Delivered");
            System.out.println("==================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void displayOrderByOrderID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Order ID: ");
        int orid = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            System.out.println("=========================================================================================================");
            System.out.println("orderID\t\tcustomerID\t\tdiscount\t\ttotal\t\torderdate\t\tstatus");
            slt = "Select * from orders where orderID =" + orid;
            rst = stmt.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("orderID");
                int cusID = rst.getInt("customerID");
                int discount = rst.getInt("discount");
                double total = rst.getDouble("total");
                String orderdate = rst.getString("orderdate");
                int status = rst.getInt("status");
                System.out.printf("%-6d\t\t%-8d\t\t%-8d\t\t%-6.1f\t\t%-12s\t%-6d\n", id, cusID, discount, total, orderdate, status);
                switch (status) {
                    case 0:
                        System.out.println("Canceled Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 1:
                        System.out.println("Confirmed Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 2:
                        System.out.println("Pending Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 3:
                        System.out.println("Ready Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 4:
                        System.out.println("Delivering Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 5:
                        System.out.println("Delivered Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    default:
                        break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void OrderDetailByOrderID() {
        System.out.println("Enter Order ID: ");
        Scanner scanner = new Scanner(System.in);
        int orid = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            System.out.println("===========================================================================================================================");
            System.out.println("orderID\t\toderdate\t\tbookID\t\ttitle\t\t\t\tprice\t\tamount");
            slt = "Select orders.orderID,orderdate,bookID,title,price,amount from orders inner join orderdetail on orders.orderID = orderdetail.orderID where orders.orderID =" + orid;
            rst = stmt.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("orderID");
                String date = rst.getString("orderdate");
                int bookid = rst.getInt("bookID");
                String title = rst.getString("title");
                double price = rst.getDouble("price");
                int amount = rst.getInt("amount");
                System.out.printf("%-6d\t\t%-12s\t%-8d\t%-12s\t\t%-6.1f\t\t%-6d\n", id, date, bookid, title, price, amount);
            }
            System.out.println("===========================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void checkUser(User user) {
        int y = user.getRole();
        if(y==1){
            menuCustomer(user);
        }else if(y==2){
            menuAdmin(user);
        }
    }
    public static void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account:");
        String name = input.nextLine();
        System.out.println("Enter your password:");
        String password = input.nextLine();
        System.out.println("Enter your role: (1-customer, 2-admin)");
        int role = Integer.parseInt(input.nextLine());
        User obj = new User(name,password,role);
        Register signUp = new Register();
        signUp.signUp(obj);
        menu();
    }
    public static void bookManagement(User user) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add new book\n" +
                    "2. Update book\n" +
                    "3. Delete book\n" +
                    "4. Display order by status\n" +
                    "5. Display order by customer id\n" +
                    "6. Display order by order id\n" +
                    "7. Order detail by order id\n" +
                    "8. Display all books" +
                    "9. Back");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addBk();
                    break;
                case 2:
                    updateBk();
                    break;
                case 3:
                    deleteBk();
                    break;
                case 4:
                    System.out.println("Enter status: ");
                    int x = scanner.nextInt();
                    displayOrderByStatus(x);
                case 5:
                    displayOrderByCustomerID();
                    break;
                case 6:
                    displayOrderByOrderID();
                    break;
                case 7:
                    OrderDetailByOrderID();
                    break;
                case 8:
                    BookController ctr = new BookController();
                    ctr.displayBook();
                    break;
                case 9:
                    menuAdmin(user);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 9);
    }
    public static void customerManagement(User user) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add new customer\n" +
                    "2. Update customer \n" +
                    "3. Delete customer\n" +
                    "4. Display all Customers\n" +
                            "5. Display all Users\n"+
                    "6. Back");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addCus();
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
                    menuAdmin(user);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 6);
    }
    public static void addCus(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer ID:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter customer name: ");
        String name = input.nextLine();
        System.out.println("Enter customer address: ");
        String address = input.nextLine();
        System.out.println("Enter customer email: ");
        String email = input.nextLine();
        System.out.println("Enter customer phone: ");
        String phone = input.nextLine();
        System.out.println("Enter type of member:(1-Diamond,2-Gold,3-Silver,4-New)");
        int member = Integer.parseInt(input.nextLine());
        Customer obj = new Customer(id,name,address,email,phone,member);
        CustomerController ctrl = new CustomerController();
        ctrl.insertCustomer(obj);
    }
    public static void updateCus(){
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
        if(ctr.updateCustomer(obj)==0){
            System.out.println("No customer found");
        }else if(ctr.updateCustomer(obj)==1){
            System.out.println("Customer has been updated");
        }
    }
    public static void deleteCus(){
        Customer obj = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id you want to delete:");
        int id = Integer.parseInt(input.nextLine());
        obj.setCustomerID(id);
        CustomerController ctr = new CustomerController();
        ctr.deleteCustomer(obj);
    }
    public static void addBk(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book ID:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter book title: ");
        String title = input.nextLine();
        System.out.println("Enter book's author: ");
        String author = input.nextLine();
        System.out.println("Enter book's quantity: ");
        int qty = Integer.parseInt(input.nextLine());
        System.out.println("Enter book price: ");
        double price = input.nextDouble();
        Book obj = new Book(id,title,author,price,qty);
        BookController ctrl = new BookController();
        ctrl.insertBook(obj);
    }
    public static void updateBk(){
        Book obj = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the book id you want to update:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter new qty: ");
        int qty = Integer.parseInt(input.nextLine());
        System.out.println("Enter new price: ");
        double price = input.nextDouble();
        System.out.println();
        obj.setBookID(id);
        obj.setPrice(price);
        obj.setQty(qty);
        BookController ctr = new BookController();
        if(ctr.updateBook(obj)==0){
            System.out.println("Wrong book's information");
        }else if(ctr.updateBook(obj)==1){
            System.out.println("Book has been updated");
        };
    }
    public static void deleteBk(){
        Book obj = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id you want to delete:");
        int id = Integer.parseInt(input.nextLine());
        obj.setBookID(id);
        BookController ctr = new BookController();
        ctr.deleteBook(obj);
    }
    public static void cusInfor(User user){
        int x = user.getId();
        CustomerController cus = new CustomerController();
        cus.display1Customer(x);
    }
    public static void cusOrder(User user){
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            int x = user.getId();
            String select = "Select * from orders where customerID = "+x;
            ResultSet rset = stmt.executeQuery(select);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()){
                for(int i=1;i<=numColumns;i++){
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void cusOrderDetail(User user){
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            int x = user.getId();
            String select = "Select orderdetail.orderID,bookID,title,amount,price,orders.orderdate,orders.status  from orderdetail inner join orders on orderdetail.orderID = orders.orderID" +
                    " inner join customers on customers.customerID = orders.customerID where customers.customerID = "+x;
            ResultSet rset = stmt.executeQuery(select);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()){
                for(int i=1;i<=numColumns;i++){
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
