package Java.example2;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date(8,2,2020);
        System.out.println(d1.toString());
        d1.setDay(23);
        d1.setMonth(12);
        d1.setYear(2012);
        System.out.println(d1);
        System.out.println("Year is: "+d1.getYear());
        System.out.println("Month is: "+d1.getMonth());
        System.out.println("Day is: "+d1.getDay());
        d1.setDate(2988,1,2);
        System.out.println(d1);
    }
}
