package example3.bookisbn;

public class BookISBNTTest {
    public BookISBNTTest(){
        
    }
    public static void main(String[] args) {
        Book obj = new Book();

        System.out.println("Enter five ISBN numbers:");
        obj.setIsbn();

        System.out.println("The ISBN numbers of book are: ");
        obj.getIsbn();

        System.out.println("The ISBN number of the books un ascending order are:");
        obj.sortIsbn();
    }
}
