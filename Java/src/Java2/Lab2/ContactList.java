package Java2.Lab2;

import Java.Lab9.C;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    List<Contact> Contacts = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    Contact contact = new Contact();

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Enter new contact name: ");
        contact.setName(input.nextLine());
        System.out.println("Enter phone number: ");
        contact.setPhone(input.nextLine());
        if (Contacts.contains(contact)) {
            System.out.println(contact + " added already!");
        } else {
            Contacts.add(contact);
            System.out.println("New contact added: " + contact.toString());
        }
    }

    public void updateContact() {
        Contact newContact = new Contact();
        System.out.println("Enter existing contact name:");
        String contactName = input.nextLine();
        for (int i = 0; i < Contacts.size(); i++) {
            if (Contacts.get(i).getName().equals(contactName)){
                System.out.println("Enter new contact name: ");
                newContact.setName(input.next());
                System.out.println("Enter new contact phone number: ");
                newContact.setPhone(input.next());
                Contacts.set(i, newContact);
                System.out.println(contactName + ", was replaced with " + newContact.getName());
                System.out.println("Successfully updated record");
            }
        }
    }
    public void removeContact() {
        System.out.println("Enter existing contact name:");
        String contactName = input.nextLine();
        for (int i = 0; i < Contacts.size(); i++) {
            if (Contacts.get(i).getName().equals(contactName)){
                Contacts.remove(i);
                System.out.println(contactName + ", was deleted");
                System.out.println("Successfully deleted");
            }
        }
    }
    public void searchContact() {
        System.out.println("Enter existing contact name:");
        String contactName = input.nextLine();
        for (int i = 0; i < Contacts.size(); i++) {
            if (Contacts.get(i).getName().equals(contactName))
                System.out.println("Name: " + Contacts.get(i).getName() + " phone number is: " + Contacts.get(i).getPhone());
        }
    }

    public void printList() {
        System.out.println("Contact List");
        if (Contacts.size() > 0) {
            Iterator<Contact> contact = Contacts.iterator();
            while (contact.hasNext()) {
                Contact contact1 = contact.next();
                System.out.println(contact1);
            }
        }
    }
}



