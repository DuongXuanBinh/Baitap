package Java.example2;

public class InvoiceItemTest {
    public static void main(String[] args) {
    InvoiceItem I = new InvoiceItem("phan","Mai",1000,122.2);
        System.out.println(I);
        I.setId("A123");
        I.setDesc("Mai");
        I.setQty(123);
        I.setUnitPrice(123.6);
        System.out.println(I);
        System.out.println("Id: "+I.getId());
        System.out.println("Desc: "+I.getDesc());
        System.out.println("Qty: "+I.getQty());
        System.out.println("UnitPrice: "+I.getUnitPrice());
        System.out.println(I);

    }
}
