package Java.example2;

public class TimeTest1 {
    public static void main(String[] args) {
        time1 t1 =new time1(22,33,22);
        System.out.println(t1);
        time1 t2 = new time1();
        System.out.println(t2);
        t1.setHour(4);
        t1.setMinute(34);
        t1.setSecond(45);
        System.out.println(t1);
        System.out.println("Hour is: "+t1.getHour());
        System.out.println("Minute is: "+t1.getMinute());
        System.out.println("Second is: "+t1.getSecond());
        t1.setTime(12,45,45);
        System.out.println(t1);
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }


}

