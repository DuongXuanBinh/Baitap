package Java.Session6;

public class Vidu1 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
        Vidu1 objCustomer1=new Vidu1();

        objCustomer1.customerID=100;
        objCustomer1.customerName="John";
        objCustomer1.customerAddress="123 Street";
        objCustomer1.customerAge=30;

        System.out.println("Customer Identification Numer: "+objCustomer1.customerID);
        System.out.println("Customer Name: "+objCustomer1.customerName);
    }
}
