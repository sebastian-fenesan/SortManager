package com.sparta.sf;

import com.sparta.sf.sorters.Sorter;

public class SortSpeed {

    public static long getSorterSpeed (Sorter sorter, int[] array) {
        long start = System.currentTimeMillis();
        sorter.sortArray(array);
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
