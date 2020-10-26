package Java.Thi.ex1;

public class Test {
    public static void main(String[] args) {
        Bank obj = new Bank(1000,10);
        System.out.println(obj);

        System.out.println("The monthly interest is: "+obj.calculateInterest());

    }

}
