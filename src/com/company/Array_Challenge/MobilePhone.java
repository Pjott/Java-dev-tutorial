package com.company.Array_Challenge;

import java.util.Scanner;

/**
 * Created by piotr on 05.02.17.
 */

    /* Create a program that implements a simple mobile phone with the following capabilities:
    - able to store, modify, remove and query contact names,
    - you will want to create a separate class for contacts (name and phone number),
    - create a master class (MobilePhone) that holds the ArrayList of Contacts,
    - the MobilePhone class has the funcionality listed above,
    - add menu of options that are available,
        Options: Quit, print list of contacts, add new contact, update existing contact, remove contact
        and search/find contact.
    When adding or updating be sure to chceck if the contact already exists (use name)
    Be sure not to expose the inner workings of the ArrayList to MobilePhone e.g. no ints, no .get(i) etc
    MobilePhone should do everything with Contact objects only.
    */

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static ContactsName ContactsName = new ContactsName();
    private static ContactsPhoneNumber ContactsPhoneNumber = new ContactsPhoneNumber();

//    public static void main(String[] args) {
//
//        addContacts();
//        showContacts();
//
//    }

    public static void addContacts() {
        System.out.println("Add contact. \nPlease add name:");
        ContactsName.addContactsName(scanner.nextLine());
        System.out.println("Please add number:");
        ContactsPhoneNumber.addContactsPhonenumber(scanner.nextInt());
    }

    public static void showContacts() {
        System.out.println("Contact Name");
        ContactsName.showContactsName();
        ContactsPhoneNumber.showContactsPhoneNumber();
    }
}
