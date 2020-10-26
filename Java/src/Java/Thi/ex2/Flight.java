package Java.Thi.ex2;

public class Flight {
    private int number;
    private String destination;

    public Flight(){
        number = 0;
        destination="";
    }
    public Flight(int number,String destination){
        if(number>=0) {
            this.number = number;
            this.destination = destination;
        }else
            System.out.println("Invalid number");
    }
    public void display(){
        System.out.println(number+","+destination);
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

}
