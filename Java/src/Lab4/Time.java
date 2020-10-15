package Lab4;

public class Time {
    private int hour, minute, second;

    public Time(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public Time(){
        this.second=0;
        this.hour=0;
        this.minute=0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour,int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        return String.format("%02d/%02d/%02d",hour,minute,second);
    }
    public Time nextSecond(){
            second++;
        if(second>=60){
            minute++;
            second=0;
            if(minute >=60){
                hour++;
                minute=0;
                if(hour>=24){
                    hour = 0;
                }
            }
        }
        return this;
    }

}
