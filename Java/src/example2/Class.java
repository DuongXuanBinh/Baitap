package example2;

import java.util.Scanner;

public class Class {
    private int classID;
    private String className;
    private String status;

    public Class(){
    };
    public Class(int classID,String className,String status){
        this.classID=classID;
        this.className=className;
        this.status=status;
    }
    public Class(int classID, String className){
        this.classID=classID;
        this.className=className;
    }
    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void changeStatus(){
        System.out.println("Input new status: ");
        Scanner input = new Scanner(System.in);
        this.status = input.next();
    }

    @Override
    public String toString() {
        return "Class{" +
                "classID=" + classID +
                ", className='" + className + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
