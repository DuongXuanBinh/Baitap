package Java.example2;

public class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public Time(){
        this.hour=0;
        this.minute=0;
        this.second=0;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    @Override
    public String toString() {
        return "Time{" +
                "hh:" + hour +
                ", mm:" + minute +
                "ss" + second +
                '}';
    }
    public void setTime(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public Time nextSecond(){
        ++second;
        if(second>=60){
            second=0;
            ++minute;
            if(minute>60){
                minute=0;
                ++hour;
                if (hour>=24){
                    hour=0;
                }
            }
        }
        return this;
    }
}
