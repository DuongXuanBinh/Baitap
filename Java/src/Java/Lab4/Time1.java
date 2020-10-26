package Java.Lab4;

public class Time1 {
    private int hour, minute, second;

    public Time1(int hour,int minute,int second){
        this.setTime(second,minute,hour);
    }
    public void setSecond(int second){
        if(second >=0&&second<=59){
            this.second=second;
        }else {
            throw new IllegalArgumentException("invalid second");
        }
    }
    public void setMinute(int minute){
        if(minute >=0&&minute<=59){
            this.minute=minute;
        }else {
            throw new IllegalArgumentException("invalid minute");
        }
    }
    public void setHour(int hour){
        if(hour >=0&&hour<=23){
            this.hour=hour;
        }else {
            throw new IllegalArgumentException("invalid hour");
        }
    }
    public Time1(){
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

    public void setTime(int hour,int minute, int second){
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);
    }
    public String toString(){
        return String.format("%02d/%02d/%02d",hour,minute,second);
    }
    public Time1 nextSecond(){
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
