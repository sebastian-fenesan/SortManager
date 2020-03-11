package com.sparta.sf.display;

import java.util.Arrays;

public class DisplayManager {

    public static void displayUnsortedArray(int[] unsortedArray) {
        System.out.println("Unsorted array: " + Arrays.toString(unsortedArray));
    }

    public static void displaySortedArray(int[] sortedArray) {
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    public static void displaySortType(String type) {
        System.out.println("Sorted using " + type);
    }

}
