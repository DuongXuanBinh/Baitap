package Lab5.ex5;

public class TestInvoice {
    public static void main(String[] args) {
        Customer obj = new Customer(111,"Binh",10);
        Invoice obj1 = new Invoice(100,obj,100000);

        System.out.println("ID is "+obj1.getID());
        System.out.println("Customer is "+obj1.getCustomer());
        System.out.println("Amount is "+obj1.getAmount());

        obj1.setAmount(15000);
        System.out.println("Amount is "+obj1.getAmount());
        System.out.println("Customer's name is: "+obj1.getCustomerName());
        System.out.println("After discount is "+obj1.getAmountAfterDiscount());
    }
}
