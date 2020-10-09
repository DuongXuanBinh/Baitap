package Session6;

public class Vidu3 {
    public static void main(String[] args) {
        Vidu2 objCustomer = new Vidu2();

        objCustomer.customerID=100;
        objCustomer.customerName="jack";
        objCustomer.customerAddress="123 Street";
        objCustomer.customerAge=30;

        objCustomer.displayCustomerInformation();

        objCustomer.changeCustomerAddress("123 Fort");

        objCustomer.displayCustomerInformation();
    }
}
