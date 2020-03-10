package com.sparta.sf.manager;

import com.sparta.sf.sorters.BubbleSorter;
import com.sparta.sf.sorters.MergeSorter;
import com.sparta.sf.sorters.Sorter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SortFactory {

//    public static Sorter getInstance (String name) {
//        if (name.equals("Bubble")) {
//            return new BubbleSorter();
//        } else if (name.equals("Merge")){
//            return new MergeSorter();
//        } else {
//            return null;
//        }
//    }

    public static Sorter getInstance() {
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("resources/sort.properties"));
            String name = properties.getProperty("sorter");
            if (name.equals("bubble")) {
                return new BubbleSorter();
            } else if (name.equals("merge")) {
                return new MergeSorter();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
