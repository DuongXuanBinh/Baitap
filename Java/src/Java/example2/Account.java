package Java.example2;

public class Account {
    private int number;
    private double balance;
    public Account(int number){
        this.number=number;
        this.balance=0.0;
    }
    public Account(int number,double balance){
        this.number=number;
        this.balance=balance;
    }
public int getNumber(){return this.number;}
public double getBalance(){return this.balance;}

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", balance=" + balance +
                '}';
    }
    public void credit(double amount){balance += amount;}
    public void dedit(double amount){
        if(balance>=amount){
            balance-=amount;
        }else{
            System.out.println("Amount Exceeded");
        }
    }
    public void transferTo(double amount,Account another){
        if(balance>=amount){
            this.balance-=amount;
            another.balance+=amount;

        }else{
            System.out.println("Amount Exceeded");
        }
    }
}
