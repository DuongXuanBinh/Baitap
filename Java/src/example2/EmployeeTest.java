package example2;


public class EmployeeTest {
    public static void main(String[] args) {

        Employee e = new Employee(1, "Phan", "Mai", 10000);
        System.out.println(e);
        e.setId(111);
        e.setFirstName("Phan");
        e.setLastName("Mai");
        e.setSalary(1111);
        System.out.println(e);
        System.out.println("Id: "+e.getId());
        System.out.println("FirstName: "+e.getFirstName());
        System.out.println("LastName: "+e.getLastName());
        System.out.println("Salary: "+e.getSalary());
        System.out.println(e);

    }
}
