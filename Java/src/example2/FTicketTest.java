package example2;

import java.util.Scanner;

public class FTicketTest {
    public static void main(String[] args) {
        FlightTicket obj=new FlightTicket();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter departure date(mm dd yyyy):");
        int month = input.nextInt();
        obj.getDate().setMonth(month);
        int day = input.nextInt();
        obj.getDate().setDay(day);
        int year = input.nextInt();
        obj.getDate().setYear(year);

        System.out.println("Enter the type of cabin:\n1.Business\n2.First\n3.Economy\n");
        int classes = input.nextInt();
        if(classes==1){
            obj.setClasses("Business");
            obj.setPrice(1500);
        }else if(classes==2){
            obj.setPrice(1200);
            obj.setClasses("First");
        }else{
            obj.getClasses();
            obj.getPrice();
        }

        System.out.println("Enter the number of tickets:");
        int qty=input.nextInt();
        obj.setQty(qty);

        System.out.println("Following is the information about the ticket(s) booked:\n" +
                "=======================================================");
        System.out.println("Departure Date: "+obj.getDate());
        System.out.println("Departure Time: "+obj.getTime());
        System.out.println("Number of tickets: "+obj.getQty());
        System.out.println("Type of cabin: "+obj.getClasses());
        System.out.println("Total cost of the ticket: "+obj.total());


    }
}
