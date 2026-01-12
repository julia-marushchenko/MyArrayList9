/**
 *  Java program to use ArrayList class.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating new ArrayList.
        List<Integer> myList = new ArrayList<>();

        // Adding elements to myList.
        myList.add(9);
        myList.add(5);
        myList.add(8);
        myList.add(16);

        // Printing myList to console.
        System.out.println(myList);

        // Creating another list.
        List<Integer> myList1 = new ArrayList<>();

        // Adding elements to myList.
        myList1.add(3);
        myList1.add(1);
        myList1.add(11);
        myList1.add(19);

        // Printing myList1 to console.
        System.out.println(myList1);

        // Merging lists.
        myList.addAll(myList1);

        // Printing final list to console.
        System.out.println(myList);

        // Removing all elements from the myList and myList1.
        myList.clear();
        myList1.clear();

        // Checking if lists are empty
        System.out.println(myList.isEmpty());
        System.out.println(myList1.isEmpty());

    }
}