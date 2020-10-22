package Lab8.Person;

public class Person {
    private String name, address;

    public Person(){
        name="";
        address="";
    }
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person(name=" + name + ",address=" + address +
                ')';
    }
}
