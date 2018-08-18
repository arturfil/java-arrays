package com.arturofilio;

public class Lamb {

    String[] array = {"Marry", "had", "a", "little", "lamb", null, null, null, null, null};
    int size = 5;

    void insert (String word, int index) {
        size++;
        for (int i = size -1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = word;
    }

    void print () {
        for (int i = 0; i < size; i++ ) {
            System.out.print(array[i] + " ");
            System.out.println();
        }
        System.out.print("===================");
        System.out.println("\n");
    }

}
