package com.sparta.sf.sorters;

public class BubbleSorter implements Sorter {

    private int temporaryValue;
    private boolean isArraySorted;

    @Override
    public int[] sortArray(int[] arrayOfNumbers) {
        isArraySorted = true;
        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            if (arrayOfNumbers[i] > arrayOfNumbers[i+1]) {
                temporaryValue = arrayOfNumbers[i];
                arrayOfNumbers[i] = arrayOfNumbers[i+1];
                arrayOfNumbers[i+1] = temporaryValue;
                isArraySorted = false;
            }
        }
        if (isArraySorted == false) sortArray(arrayOfNumbers);
        return arrayOfNumbers;
    }

    @Override
    public String toString() {
        return "Bubble Sorter";
    }
}
