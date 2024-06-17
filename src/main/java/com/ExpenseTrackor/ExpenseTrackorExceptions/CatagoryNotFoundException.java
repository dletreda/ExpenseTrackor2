package com.ExpenseTrackor.ExpenseTrackorExceptions;

public class CatagoryNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;  

    public CatagoryNotFoundException(String message) {
        super(message);
    }

    public CatagoryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
