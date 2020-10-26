package Java.Lab8.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person obj = new Person("Binh","Van Phuc");
        obj.getName();
        obj.getAddress();
        obj.toString();

        Person std = new Student("Binh","Van Phuc","IT",2020,10000);
        std.toString();

        Staff stf=new Staff("Binh","Van Phuc","IT",3000);
        stf.getPay();
    }

}
