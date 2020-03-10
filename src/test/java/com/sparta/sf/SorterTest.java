package com.sparta.sf;

import com.sparta.sf.manager.SortManager;
import com.sparta.sf.sorters.BubbleSorter;
import com.sparta.sf.sorters.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SorterTest {

    private int[] unsortedArray;
    private Sorter sorter;

    @BeforeEach
    public void setup () {
        unsortedArray = new int[]{5,3,-4,6,4,20,0,1,2,1};
        sorter = new BubbleSorter();
    }

    @Test
    public void testIfArraySorted() {
        int[] sortedArray = sorter.sortArray(unsortedArray);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(new int[]{-4,0,1,1,2,3,4,5,6,20}));
    }

    @Test
    public void testSizeOfArray() {
        System.out.println(Arrays.toString(unsortedArray));
    }
}
