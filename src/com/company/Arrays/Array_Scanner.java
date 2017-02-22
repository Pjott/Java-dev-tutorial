package com.company.Arrays;

import java.util.Scanner;

/**
 * Created by piotr on 28.01.17.
 * Wypełnianie tablicy po przez wprowadzane danych z klawiatury
 * Za pomocą 'Scanner'
 */
public class Array_Scanner {

    // umożliwienie wprowadzania danych z klaiwaury
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
        }

        //przywołanie funkcji, która liczy średnią naszych wartości z tabeli
        System.out.println("The average is " + getAverage(myIntegers));


    }
    // funkcja która inicjuje wprowadzania danych, czyli uzupełnianie naszej tabeli myItegers
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

       // liczenie sredniej wartosci z calej tabeli
    public static double getAverage(int[] array) {
        int sum = 0;
        for( int i = 0; i < array.length; i++) {
            sum +=array[i];
        }

        return (double) sum / (double)array.length;

    }


}
