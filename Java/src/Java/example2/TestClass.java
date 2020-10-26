package Java.example2;

public class TestClass {
    public static void main(String[] args) {
        Class class1=new Class(10,"Toan","active");
        Class class2=new Class(20,"Van","finish");
        Student student1 = new Student(1,"Binh",3.5,class1);
        Student student2=new Student(2,"Dat",2.5,class2);
        Class class3=new Class(30,"Anh");
        Student student3=new Student(3,"Thi");

        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class3);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Change class of Student 2: ");
        student2.changeClass();
        System.out.println(student2);
        System.out.println("Change GPA of Student 1: ");
        student1.changeGPA();
        System.out.println(student1);
        System.out.println("Change status of Anh class: ");
        class3.changeStatus();
        System.out.println(class3);
    }
}
