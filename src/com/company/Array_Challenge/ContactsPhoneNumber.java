package com.company.Array_Challenge;

import java.util.ArrayList;

/**
 * Created by piotr on 06.02.17.
 */
public class ContactsPhoneNumber {

    //tworzę ArrayListę z nu,eramitelefonow.
    private ArrayList<Integer> contactsPhonenNumber = new ArrayList<>();

    //getter
    public ArrayList<Integer> getContactsPhonenNumber() {
        return contactsPhonenNumber;
    }

    //dodawanie imion do kontaktów
    public void addContactsPhonenumber(int number) {
        contactsPhonenNumber.add(number);
    }

    //wyswietanie zawartosci
    public void showContactsPhoneNumber() {

        for (int i = 0; i < contactsPhonenNumber.size(); i ++) {
            System.out.println((i+1) + ". " + contactsPhonenNumber.get(i));
        }
    }

    //ArrayList<String> blabla = new ArrayList<>();

}
