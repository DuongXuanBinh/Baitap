package Java.example2;

import java.util.Scanner;

public class Student {
    private int rollNo;
    private String name;
    private double GPA;
    private Class classes;

    public Student(int rollNo,String name, double GPA, Class classes){
        this.rollNo=rollNo;
        this.name=name;
        this.GPA=GPA;
        this.classes=classes;
    }
    public Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Class getClasses() {
        return classes;
    }

    public void setClasses(Class classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                ", classes=" + classes +
                '}';
    }
    public void changeName(){
        System.out.println("Input new Name");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();
    }
    public void changeGPA(){
        System.out.println("Input new GPA");
        Scanner input = new Scanner(System.in);
        this.GPA = input.nextDouble();
    }
    public void changeClass(){
        System.out.println("Input new Class(ID Name Status): ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        classes.setClassID(id);
        String name = input.next();
        classes.setClassName(name);
        String status = input.next();
        classes.setStatus(status);
    }
}
