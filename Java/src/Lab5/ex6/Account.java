package Lab5.ex6;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0d;

    public Account(int id, Customer customer, double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id, Customer customer){
        this.id=id;
        this.customer=customer;
        this.balance=0.0d;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s balance= $%.2f",customer.toString(),balance);
    }
    public String getCustomerName(){
        return this.customer.getName();
    }
    public double deposit(double amount){
       return this.balance+=amount;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("OK! The money left is: $"+balance);
        }else{
            System.out.println("Balance is not enough");
        }
    }
}
