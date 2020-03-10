package com.sparta.sf.manager;

import com.sparta.sf.display.DisplayManager;
import com.sparta.sf.sorters.Sorter;

public class SortManager {

    public void runSorter (int[] unsortedArray) {
        Sorter sorter = SortFactory.getInstance();
        int[] sortedArray = sorter.sortArray(unsortedArray.clone());
        displayOutput(unsortedArray, sortedArray, sorter.toString());
    }

    private void displayOutput(int[] unsortedArray, int[] sortedArray, String type) {
        DisplayManager.displayUnsortedArray(unsortedArray);
        DisplayManager.displaySortType(type);
        DisplayManager.displaySortedArray(sortedArray);
    }

}