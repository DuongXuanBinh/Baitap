package Java.Lab4;

public class TestTime1 {
    public static void main(String[] args) {
        int hour =24, minute = 58, second = 58;
        Time1 t12;

        try {
            t12 = new Time1(second, minute, hour);
            System.out.println("Valid input");
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
            System.out.println("Error in input. Set to default value");
            t12 = new Time1();
        }
        System.out.println("Time is"+t12);
        System.out.println("Life goes on...");
    }
}
