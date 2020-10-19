package example3.bookrespository;

public class Book {
    String name;
    String authorName;
    int isbn;
    float price;
    short yearPublished;

    public Book(){
        this.name = "";
        this.authorName="";
        this.isbn = 0;
        this.price = 0;
        this.yearPublished = 0;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    public short getYearPublished() {
        return yearPublished;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setYearPublished(short yearPublished) {
        this.yearPublished = yearPublished;
    }
}
