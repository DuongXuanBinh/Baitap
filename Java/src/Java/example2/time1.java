package Java.example2;

public class time1 {
    private int second;
    private int minute;
    private int hour;
    public void setSecond(int second){
        if(second>=0 && second<=59){
            this.second=second;
        }else{
            this.second=0;
            System.out.println("Error: invalid second");
        }
    }
    public void setMinute(int minute){
        if(minute>=0 && minute<=59){
            this.minute=minute;
        }else{
            this.minute=0;
            System.out.println("Error: invalid second");
        }
    }
    public void setHour(int hour){

        if(minute>=0 && minute<=23){
            this.hour=hour;
        }else{
            this.hour=0;
            System.out.println("Error: invalid second");
        }
    }
public void setTime(int second,int minute,int hour){
        this.setSecond(second);
        this.setMinute(minute);
        this.setHour(hour);

}
public time1(int second,int minute,int hour){
        this.setTime(second,minute,hour);
}
public time1(){
        this.second=0;
        this.minute=0;
        this.hour=0;
}
public int getSecond(){return this.second;}
    public int getMinute(){return this.minute;}
    public int getHour(){return this.hour;}

    @Override
    public String toString() {
        return "time1{" +
                "second=" + second +
                ", minute=" + minute +
                ", hour=" + hour +
                '}';
    }
    public  time1 nextSecond(){

        ++second;
        if(second==60){
            second=0;
            ++minute;
            if(minute==60){
                minute=0;
                ++hour;
                if(hour==24){
                    hour=0;
                }
            }
        }
        return this;
    }
}
