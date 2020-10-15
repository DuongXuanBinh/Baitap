package Lab5.ex6;

public class TestCustomer {
    public static void main(String[] args) {
        Customer obj = new Customer(111,"Binh",'M');

        System.out.println("Id is "+obj.getID());
        System.out.println("Name is "+obj.getName());
        System.out.println("Gender is "+obj.getGender());

        System.out.println(obj);
    }
}
