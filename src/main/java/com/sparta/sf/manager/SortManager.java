package com.sparta.sf.manager;

import com.sparta.sf.display.DisplayManager;
import com.sparta.sf.exceptions.SorterException;
import com.sparta.sf.sorters.Sorter;

import java.util.Optional;

public class SortManager {

    public void runSorter(int[] unsortedArray) {
        Sorter sorter = SortFactory.getInstance();
        if (sorter != null) {
            int[] sortedArray = sorter.sortArray(unsortedArray.clone());
            displayOutput(unsortedArray, sortedArray, sorter.toString());
        } else {
            try {
                throw new SorterException("Unable to create the stated Sorter.");
            } catch (SorterException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void displayOutput(int[] unsortedArray, int[] sortedArray, String type) {
        DisplayManager.displayUnsortedArray(unsortedArray);
        DisplayManager.displaySortType(type);
        DisplayManager.displaySortedArray(sortedArray);
    }

}