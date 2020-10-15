package Lab5.ex6;

public class TestAccount {
    public static void main(String[] args) {
        Customer obj = new Customer(111,"Binh",'M');
        Account obj1 = new Account(100,obj);

        System.out.println("ID is "+obj1.getId());
        System.out.println("Customer is "+obj1.getCustomer());
        System.out.println("Balance is "+obj1.getBalance());
        System.out.println(obj1);

        obj1.setBalance(100);
        System.out.println("Balance is "+obj1.getBalance());
        System.out.println("Customer's name is "+obj1.getCustomerName());
        System.out.println("Deposit is "+obj1.deposit(2));
        obj1.withdraw(5);
    }
}
