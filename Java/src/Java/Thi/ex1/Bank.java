package Java.Thi.ex1;

public class Bank {
    private double balance;
    private double rate;

    public Bank(double balance, double rate){
        this.balance=balance;
        this.rate=rate;
    }
    public double calculateInterest(){
        return balance * (rate/1200);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }
}
