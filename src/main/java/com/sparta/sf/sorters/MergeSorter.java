package com.sparta.sf.sorters;

public class MergeSorter implements Sorter {

    private int[] mergeSortedArrays(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        int i = 0;
        int j = 0;
        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] < secondArray[j]) {
                mergedArray[i + j] = firstArray[i];
                i++;
            } else {
                mergedArray[i + j] = secondArray[j];
                j++;
            }
        }
        while (i < firstArray.length) {
            mergedArray[i + j] = firstArray[i];
            i++;
        }
        while (j < secondArray.length) {
            mergedArray[i + j] = secondArray[j];
            j++;
        }
        return mergedArray;
    }

    @Override
    public int[] sortArray(int[] unsortedArray) {
        if (unsortedArray.length <= 1) {
            return unsortedArray;
        }
        int[] temporaryArray1 = new int[unsortedArray.length / 2];
        int[] temporaryArray2 = new int[unsortedArray.length - unsortedArray.length / 2];
        int j = 0;
        for (int i = 0; i < unsortedArray.length; i++) {
            if (i < unsortedArray.length / 2) {
                temporaryArray1[i] = unsortedArray[i];
            } else {
                temporaryArray2[j] = unsortedArray[i];
                j++;
            }
        }
        int[] splitArray1 = sortArray(temporaryArray1);
        int[] splitArray2 = sortArray(temporaryArray2);
        return mergeSortedArrays(splitArray1, splitArray2);
    }

    @Override
    public String toString() {
        return "Merge Sorter";
    }
}