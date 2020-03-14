package com.sparta.sf.exceptions;

import org.apache.log4j.Logger;

public class SorterException extends Exception {

    private String message;

    public SorterException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
