package com.sparta.sf.display;

import com.sparta.sf.manager.SortManager;

public class Starter {

    public static void main(String[] args) {

        int[] testArray = {5,3,-4,6,4,20,0,1,2,1};
        SortManager sortManager = new SortManager();
        sortManager.runSorter(testArray);
    }

}
