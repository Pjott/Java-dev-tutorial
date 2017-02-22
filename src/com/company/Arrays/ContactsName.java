package com.company.Arrays;

import java.util.ArrayList;

/**
 * Created by piotr on 06.02.17.
 */
public class ContactsName {

    //tworzę ArrayListę z imionami.
    private ArrayList<String> contactsName = new ArrayList<>();

    //getter
    public ArrayList<String> getContactsName() {
        return contactsName;
    }

    //dodawanie imion do kontaktów
    public void addContactsName(String name) {
        contactsName.add(name);
    }

   // wyswietanie zawartosci
    public void showContactsName() {

       for (int i = 0; i < contactsName.size(); i ++) {
           System.out.println((i+1) + ". " + contactsName.get(i));
    }
    }

    //ArrayList<String> blabla = new ArrayList<>();


}
