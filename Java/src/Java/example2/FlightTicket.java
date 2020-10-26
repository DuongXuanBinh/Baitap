package Java.example2;

public class FlightTicket {
    private FDate date;
    private FTime time;
    private int qty;
    private String classes;
    private double price = 1000;

    public FlightTicket(FDate date,FTime time, int qty,String classes,double price){
        this.date=date;
        this.time=time;
        this.qty=qty;
        this.classes=classes;
        this.price=price;
    }
    public FlightTicket(){
        date = new FDate(1000,10,10);
        time=new FTime(10,10);
        qty=0;
        classes="Economy";
        price=1000;
    }

    public FDate getDate() {
        return date;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public FTime getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(FDate date) {
        this.date = date;
    }

    public void setTime(FTime time) {
        this.time = time;
    }

    public int getQty() {
        return qty;
    }
    public double total(){
        return qty*price;
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "date=" + date +
                ", time=" + time +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}

