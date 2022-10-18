package com.kienast.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner sc = new Scanner(System.in);

    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    private boolean addNewContact(Contact newContact) {
        if (findContact(newContact) == -1) {
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    private boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) != -1) {
            myContacts.remove(oldContact);
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    private boolean removeContact(Contact contact) {
        if (findContact(contact) != -1) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private Contact queryContact(String name) {
        if (findContact(name) != -1) {
            return myContacts.get(findContact(name));
        }
        return null;
    }

    private void printContacts() {
        for (Contact contact : myContacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    public void startPhone() {
        System.out.println("Mobile phone starting up...");
        printOptions();

        boolean shouldContinue = true;

        while (shouldContinue) {
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int userChoice = sc.nextInt();
                sc.nextLine();
                switch (userChoice) {
                    case 1 -> addItem();
                    case 2 -> modifyItem();
                    case 3 -> removeItem();
                    case 4 -> searchItem();
                    case 5 -> printContacts();
                    case 6 -> shouldContinue = false;
                    default -> {
                        System.out.println("Invalid input, please choose a valid option.");
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Invalid input,please choose a valid option.");
                System.out.println();
                sc.nextLine();
            }
            printOptions();
        }
    }

    private void addItem() {
        System.out.println("Enter name...");
        String name = sc.nextLine();
        System.out.println("Enter phone number...");
        String phoneNumber = sc.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        boolean success = addNewContact(newContact);
        if (success) {
            System.out.println("Contact successfully saved!");
        } else {
            System.out.println("Contact NOT saved!");
        }
    }

    private void modifyItem() {
        System.out.println("Enter old name...");
        String oldName = sc.nextLine();
        System.out.println("Enter old phone number...");
        String oldPhoneNumber = sc.nextLine();
        Contact oldContact = Contact.createContact(oldName, oldPhoneNumber);

        System.out.println("Enter new name...");
        String newName = sc.nextLine();
        System.out.println("Enter new phone number...");
        String newPhoneNumber = sc.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);

        boolean success = updateContact(oldContact, newContact);
        if (success) {
            System.out.println("Contact successfully updated!");
        } else {
            System.out.println("Contact NOT updated!");
        }
    }

    private void removeItem() {
        System.out.println("Enter name...");
        String name = sc.nextLine();
        System.out.println("Enter phone number...");
        String phoneNumber = sc.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        boolean success = removeContact(newContact);
        if (success) {
            System.out.println("Contact successfully removed!");
        } else {
            System.out.println("Contact NOT removed!");
        }
    }

    private void searchItem() {
        System.out.println("Enter name...");
        String name = sc.nextLine();
        Contact foundContact = queryContact(name);
        if (foundContact != null) {
            System.out.println(foundContact.getName() + " -> " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact NOT found!");
        }
    }

    private static void printOptions() {
        System.out.println("1. Add new contact");
        System.out.println("2. Update contact");
        System.out.println("3. Remove contact");
        System.out.println("4. Find contact");
        System.out.println("5. Show all contacts");
        System.out.println("6. Turn off");
    }
}
