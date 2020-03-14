package com.sparta.sf.display;

import com.sparta.sf.exceptions.SorterException;
import com.sparta.sf.manager.SortManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Starter {

    static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    static Logger log = Logger.getLogger(Starter.class.getName());

    public static void main(String[] args) {

        initialiseLogging();
        int[] testArray = {5, 3, -4, 6, 4, 20, 0, 1, 2, 1};
        SortManager sortManager = new SortManager();
        sortManager.runSorter(testArray);
    }

    private static void initialiseLogging() {
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
    }

}
