package Java.Session7;

public class Vidu3 {
    public void setVal(int num1){
        num1=num1+10;
    }

    public static void main(String[] args) {
        int num1=10;
        Vidu3 obj = new Vidu3();
        obj.setVal(num1);
        System.out.println("Value of num1 after invoking setval is "+num1);
    }
}
