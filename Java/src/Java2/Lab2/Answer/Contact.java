package Java2.Lab2.Answer;

public class Contact {
    private String name;
    private String phone;

    public Contact(){
        name = "";
        phone = "";
    }
    public Contact(String name, String phone){
        this.name=name;
        this.phone=phone;
    }
    public static Contact createContact(String name,String phone){
        return new Contact(name,phone);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "name=" + name  +
                ", phone=" + phone;
    }
}
