package Java.Session6;

public class Vidu2 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    void changeCustomerAddress(String address){
        customerAddress=address;
    }

    void displayCustomerInformation(){
        System.out.println("Customer Identification Number: "+customerID);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Customer Address: "+customerAddress);
        System.out.println("Customer Age: "+customerAge);
    }
}
