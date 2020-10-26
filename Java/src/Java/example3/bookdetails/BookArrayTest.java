package Java.example3.bookdetails;

import java.util.Scanner;

public class BookArrayTest {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        Book objBook = new Book();
        do {
            System.out.println("\nWelcome to E-Repository.\n Select the question you want to perform: ");
            System.out.println("***********************************************************************");
            System.out.println("1. Add book to repository");
            System.out.println("2. Search book by ISBN number");
            System.out.println("3. Search book by Year");
            System.out.println("4. Display book details");
            System.out.println("5. Exit");
            System.out.println("***********************************************************************");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    objBook.addBook();
                    break;
                case 2:
                    objBook.searchByIsbn();
                    break;
                case 3:
                    objBook.searchByYear();
                    break;
                case 4:
                    objBook.displayBooks();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }while(choice!=5);
    }
}
