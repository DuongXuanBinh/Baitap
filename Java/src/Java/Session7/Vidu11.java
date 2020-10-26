package Java.Session7;

public class Vidu11 {
    public void add(int num1, int num2){
        System.out.println("Result after addition is "+(num1+num2));
    }
    public void add(int num1, int num2, int num3){
        System.out.println("Result after addition is "+(num1+num2+num3));
    }
    public void add(float num1, int num2){
        System.out.println("Result after addition is "+(num1+num2));
    }
    public void add(int num1, float num2){
        System.out.println("Result after addition is "+(num1+num2));
    }
    public void add(float num1, float num2){
        System.out.println("Result after addition is "+(num1+num2));
    }

    public static void main(String[] args) {
        Vidu11 objMath = new Vidu11();
        objMath.add(3.4F,2);
        objMath.add(4,5);
        objMath.add(6,7,8);
    }
}
