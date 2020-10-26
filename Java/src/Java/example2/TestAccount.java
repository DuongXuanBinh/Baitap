package Java.example2;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(5566);
        System.out.println(a1);
        Account a2 = new Account(1234,99.9);
        System.out.println(a2);
        System.out.println("the Account Number is: "+a2.getNumber());
        System.out.println("The Balace is: "+a2.getBalance());
        a1.credit(11.1);
        System.out.println(a1);
        a1.dedit(5.5);
        System.out.println(a1);
        a1.dedit(500);
        System.out.println(a1);
        a2.transferTo(1.0,a1);
        System.out.println(a1);
    }
}
