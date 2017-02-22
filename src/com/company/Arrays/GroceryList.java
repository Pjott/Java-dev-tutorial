package com.company.Arrays;

import java.util.ArrayList;

/**
 * Created by piotr on 04.02.17.
 */
// List and Array List

public class GroceryList {

    //tworzymy ArrayListę 'groceryList' w której przechowywane będą wartości <String>
    private ArrayList<String> groceryList = new ArrayList<>();

    //dodwanie obiektów do naszej ArrayList
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //metoda, która pokaże nam zawartość naszej Array Listy
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for(int i=0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    //Z racji tego że dodając nowe wartośći już na istniejące nadpisujemy je możemy stworzyć metodę, która
    //zmienia zawartość danej pozycji w ArrayList
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    //Usuwanie pozycji z ArrayListy
    private void removeGroceryItem (int position) {
       groceryList.remove(position);
    }

    //Metoda, która szuka elementów w mojej liście
    private int findItem(String searchItem) {
      return groceryList.indexOf(searchItem);
        }

        public boolean onFile(String searchItem) {
            int position = findItem(searchItem);
            if(position >= 0) {
                return true;
            }
            return false;
        }

    }


