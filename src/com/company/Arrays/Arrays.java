package com.company.Arrays;

/**
 * Created by piotr on 28.01.17.
 */
public class Arrays {
    public static void main(String[] args) {
        // simple array assigment
        int[] myVariable = {10, 4, 7, 98, 2, 15, 22, 34};
        int[] myVariable1 = new int[10];
        //System.out.println(myVariable[1]);
        System.out.println("zastosowanie pętli for:");
        for (int i = 0; i < myVariable.length; i++) {
            System.out.println(myVariable[i]);
        }

        System.out.println("zastosowanie funkcji printArray:");
        printArray(myVariable);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
