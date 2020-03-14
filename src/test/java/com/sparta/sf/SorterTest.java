package com.sparta.sf;

import com.sparta.sf.manager.SortFactory;
import com.sparta.sf.manager.SortManager;
import com.sparta.sf.sorters.BubbleSorter;
import com.sparta.sf.sorters.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class SorterTest {

    private int[] unsortedArray;
    private Sorter sorter;

    @BeforeEach
    public void setup () {
        sorter = SortFactory.getInstance();
        unsortedArray = createArray(1000);
        System.out.println("Testing using the " + sorter.toString());
    }

    @Test
    public void testIfArraySorted() {
        int[] sortedArray = sorter.sortArray(createArray(10000));
        Assertions.assertEquals(Arrays.toString(new int[]{-4,0,1,1,2,3,4,5,6,20}), Arrays.toString(sortedArray));
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    public void testSizeOfArray() {
        System.out.println(Arrays.toString(unsortedArray));
    }

    @Test
    public void testSorterSpeed() {
        System.out.println("Time taken: " + SortSpeed.getSorterSpeed(sorter, unsortedArray) + " milliseconds");
    }

    private int[] createArray(int size) {
        Random random = new Random();
        unsortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            unsortedArray[i] = random.nextInt(1000000) + 1;
        }
        return unsortedArray.clone();
    }
}
