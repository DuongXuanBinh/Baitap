package Java.Lab5.ex2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name,Author[] author, double price) {
        this.name = name;
        this.authors = author;
        this.price = price;
    }

    public Book(String name,Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + authors +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

//    public String getAuthorNames(){
//        for(int i=0;i< authors.length;i++){
//            String a = getAuthors()[i].getName();
//        }
//       return a;
//    }
}
