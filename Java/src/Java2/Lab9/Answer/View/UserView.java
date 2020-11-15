package Java2.Lab9.Answer.View;

import Java.Lab9.B;
import Java2.Lab9.Answer.Models.User;
import Java2.Lab9.Answer.Models.Customer;
import Java2.Lab9.Answer.Controllers.CustomerController;
import Java2.Lab9.Answer.Controllers.UserController;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class UserView {
    Scanner input = new Scanner(System.in);
    public String slt;
    public ResultSet rst;


    public int checkUser(User user) {
        BookShop bookShop = new BookShop();
        int y = user.getRole();
        if (y == 1) {
            bookShop.menuCustomer(user);
            return 1;
        } else if (y == 2) {
            bookShop.menuAdmin(user);
            return 2;
        }
        return 0;
    }

    public User createAccount() {
        Scanner input = new Scanner(System.in);

        CustomerController ctr2 = new CustomerController();
        List<Customer> list2 = ctr2.loading();
        UserController userCtr = new UserController();
        CustomerView cusCtr = new CustomerView();
        String account;
        int j = 0;
        do {
            System.out.println("(SignUp)Enter your account:");
            account = input.nextLine();
            j = userCtr.checkAccount(account);
        } while (j != 0);
        System.out.println("(SignUp)Enter your password:");
        String password = input.nextLine();
        System.out.println("(SignUp)Enter your role: (1-customer, 2-admin)");
        int role = Integer.parseInt(input.nextLine());
        User obj = new User(account, password, role);
        UserController signUp = new UserController();
        boolean check = signUp.signUp(obj);
        if (check) {
            if (role==1) {
                boolean checks = cusCtr.addCus(obj);
                if (checks) {
                    System.out.println("Signup successfully");
                    return obj;
                } else {
                    System.out.println("Sign up failed");
                    BookShop news = new BookShop();
                    news.menuUser();
                    return null;
                }
            }
        } else if(role ==2) {
            if (check) {
                System.out.println("Signup successfully");
                UserController reg = new UserController();
                User news = reg.signIn();
                checkUser(news);
                return obj;
            }else{
                System.out.println("Sign up failed");
                BookShop news = new BookShop();
                news.menuUser();
                return null;
            }
        }return null;
    }
}
