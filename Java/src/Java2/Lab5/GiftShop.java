package Java2.Lab5;

import java.util.Scanner;

public class GiftShop {
    public static void main(String[] args) {
        GiftController gif = new GiftController();
        GiftShop giftt = new GiftShop();
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
            switch (choice) {
                case 1:
                    giftt.display();
                    break;
                case 2:
                    giftt.add();
                    break;
                case 3:
                    giftt.deteled();
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        } while (choice != 4);
    }

    public void add() {
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
        GiftController obj1 = new GiftController();
        obj1.insert(obj);
    }

    public void deteled() {
        System.out.println("Enter id of book you want to delete: ");
        Gift obj = new Gift();
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        obj.setId(id);
        GiftController obj1 = new GiftController();
        obj1.delete(obj);
    }
    public void display(){
        GiftController obj1 = new GiftController();
        obj1.loading();
        for(int i = 0 ;i< obj1.listObj.size();i++){
            System.out.printf("\n%-30d%-30s%-30s%-30.2f%-30d",obj1.listObj.get(i).getId(),obj1.listObj.get(i).getName(),obj1.listObj.get(i).getAuthor(),obj1.listObj.get(i).getPrice(),obj1.listObj.get(i).getQty());
        }
        System.out.println();
    }
}
