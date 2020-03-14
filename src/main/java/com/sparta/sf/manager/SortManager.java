package com.sparta.sf.manager;

import com.sparta.sf.display.DisplayManager;
import com.sparta.sf.display.Starter;
import com.sparta.sf.exceptions.SorterException;
import com.sparta.sf.sorters.Sorter;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Optional;

public class SortManager {

    private Logger log = Logger.getLogger(SortManager.class.getName());

    public void runSorter(int[] unsortedArray) {
        Sorter sorter = SortFactory.getInstance();
        if (sorter != null) {
            int[] sortedArray = sorter.sortArray(unsortedArray.clone());
            displayOutput(unsortedArray, sortedArray, sorter.toString());
        } else {
            try {
                throw new SorterException("Unable to create the stated sorter.");
            } catch (SorterException e) {
                log.debug(e.getMessage());
            }
        }
    }

    private void displayOutput(int[] unsortedArray, int[] sortedArray, String type) {
        DisplayManager.displayUnsortedArray(unsortedArray);
        DisplayManager.displaySortType(type);
        DisplayManager.displaySortedArray(sortedArray);
    }



}