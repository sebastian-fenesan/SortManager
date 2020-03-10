package com.sparta.sf.manager;

import com.sparta.sf.display.DisplayManager;
import com.sparta.sf.exceptions.SorterException;
import com.sparta.sf.sorters.Sorter;

import java.util.Optional;

public class SortManager {

    public void runSorter (int[] unsortedArray) throws SorterException {
        Optional<Sorter> opt = SortFactory.getInstance();
        if (opt.isPresent()) {
            Sorter sorter = opt.get();
            int[] sortedArray = sorter.sortArray(unsortedArray.clone());
            displayOutput(unsortedArray, sortedArray, sorter.toString());
        } else {
            throw new SorterException("Unable to create the stated Sorter.");
        }
    }

    private void displayOutput(int[] unsortedArray, int[] sortedArray, String type) {
        DisplayManager.displayUnsortedArray(unsortedArray);
        DisplayManager.displaySortType(type);
        DisplayManager.displaySortedArray(sortedArray);
    }

}