package Java.Session7;

public class Vidu12 {
    int rollNo;
    String name;
    String address;
    float marks;

    public Vidu12(){
        rollNo = 0;
        name = "";
        address = "";
        marks=0;
    }
    public Vidu12(int rNo, String sname){
        rollNo=rNo;
        name=sname;
    }
    public Vidu12(int rNo, float score){
        rollNo=rNo;
        marks = score;
    }
    public Vidu12(String sName, String addr){
        name = sName;
        address=addr;
    }
    public Vidu12(int rNo, String sname,float score){
        rollNo=rNo;
        name=sname;
        marks=score;
    }
    public void displayDetails(){
        System.out.println("Rollno: "+rollNo);
        System.out.println("Student name:"+name);
        System.out.println("Address "+address);
        System.out.println("Score "+marks);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Vidu12 obj = new Vidu12("David","302,Washington street");
        obj.displayDetails();
        Vidu12 obj2=new Vidu12(103,46);
        obj2.displayDetails();
        Vidu12 obj3 = new Vidu12(104,"Roger",50);
        obj3.displayDetails();
    }
}
