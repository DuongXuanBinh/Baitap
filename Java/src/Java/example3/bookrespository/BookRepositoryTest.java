package Java.example3.bookrespository;

import java.util.Scanner;

public class BookRepositoryTest {
    Book[] books;
    byte bookCount =0;

    public BookRepositoryTest(){
        this.books = new Book[5];
        for(int i = 0;i<books.length;i++){
            books[i]=new Book();
        }
        this.bookCount=0;
    }
    void addBook(){
        Scanner input = new Scanner(System.in);
        if(bookCount<books.length){
            System.out.println("Enter name of book: ");
            books[bookCount].name = input.nextLine();
            System.out.println("Enter author name: ");
            books[bookCount].authorName = input.nextLine();
            System.out.println("Enter ISBN of book: ");
            books[bookCount].isbn=input.nextInt();
            System.out.println("Enter the price of book: ");
            books[bookCount].price=input.nextFloat();
            System.out.println("Enter the publish year: ");
            books[bookCount].yearPublished = input.nextShort();
            bookCount++;
        }else{
            System.out.println("Cannot add more book");
        }
    }
    void displayBooks(){
        if(bookCount>0){
            System.out.println("ISBN \t\t\tName \t\t\tAuthor Name \t\tPrice \t\tYear of publication");
            System.out.println("====================================================================");
            for(int i = 0; i<bookCount;i++){
                System.out.printf("%d\t\t\t",books[i].isbn);
                System.out.printf("%s\t\t\t",books[i].name);
                System.out.printf("%s\t\t",books[i].authorName);
                System.out.printf("%f\t\t",books[i].price);
                System.out.printf("%d\n",books[i].yearPublished);
            }
        }else{
            System.out.println("No book to display");
        }
    }
    void searchByName(){
        boolean bookfound = false;
        if (bookCount>0){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name of book you want to search");
            String searchName = input.nextLine();
            System.out.println("ISBN \t\t\tName \t\t\tAuthor Name \t\tPrice \t\tYear of publication");
            System.out.println("====================================================================");
            for(int i=0;i<bookCount;i++){
                if(books[i].name.equals(searchName)){
                    System.out.printf("%d\t\t\t",books[i].isbn);
                    System.out.printf("%s\t\t\t",books[i].name);
                    System.out.printf("%s\t\t",books[i].authorName);
                    System.out.printf("%f\t\t",books[i].price);
                    System.out.printf("%d\n",books[i].yearPublished);
                    bookfound=true;
                }
            }
            if (!bookfound){
                System.out.println("No book found");
            }
        }else{
            System.out.println("No book to search");
        }
    }
    public static void main(String[] args) {
        BookRepositoryTest obj = new BookRepositoryTest();
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\nWelcome to E-Repository.\n Select the question you want to perform: ");
            System.out.println("***********************************************************************");
            System.out.println("1. Add book to repository");
            System.out.println("2. Search book by book name");
            System.out.println("3. Display book details");
            System.out.println("4. Exit");
            System.out.println("***********************************************************************");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    obj.addBook();
                    break;
                case 2:
                    obj.searchByName();
                    break;
                case 3:
                    obj.displayBooks();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice!=4);
    }
}
