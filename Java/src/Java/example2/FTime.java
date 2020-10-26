package Java.example2;

public class FTime {
    private int hour;
    private int minute;

    public FTime(int hour, int minute){
        this.hour = hour;
        this.minute=minute;
    }

    @Override
    public String toString() {
        return hour+":"+minute;
    }
}
