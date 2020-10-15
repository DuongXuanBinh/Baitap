package example2;

public class timeTest2 {
    public static void main(String[] args) {
        int hour=21,minute=58,second=58;
        time2 t12;
        try{
            t12=new time2(second,minute,hour);
            System.out.println("Valid input");
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
            System.out.println("Error in input.Set to default value");
            t12=new time2();
        }
        System.out.println("Time is" +t12);
        System.out.println("Life goes on ....");
    }
}
