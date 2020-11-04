package Java2.Lab5;

import java.util.Scanner;

public class GiftShop extends GiftController {
    public static void main(String[] args) {
        loading();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("This is what you can do:\n" +
                    "1. Display all the books\n" +
                    "2. Insert new book\n" +
                    "3. Delete book\n" +
                    "4. Exit");
            System.out.println("Enter you choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    select();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        }while(choice!=4);
    }
    public static void add(){
        Scanner input = new Scanner(System.in);
        Gift obj = new Gift();
        System.out.println("Enter book id: ");
        int id = input.nextInt();
        obj.setId(id);
        System.out.println("Enter book name: ");
        String title = input.nextLine();
        obj.setName(input.nextLine());
        System.out.println("Enter author name: ");
        String author = input.nextLine();
        obj.setAuthor(author);
        System.out.println("Enter price: ");
        double price = input.nextDouble();
        obj.setPrice(price);
        System.out.println("Enter quantity: ");
        int qty = input.nextInt();
        obj.setQty(qty);
        insert(obj);
    }
}
