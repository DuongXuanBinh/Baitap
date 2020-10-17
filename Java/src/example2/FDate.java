package example2;

public class FDate {
    private int year;
    private int month;
    private int day;

    public FDate(int year,int month,int day){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return month+"/"+day+"/"+year;
    }
}
