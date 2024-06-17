package com.ExpenseTrackor.ExpenseTrackorExceptions;

public class ExpenseNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;  
	public ExpenseNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExpenseNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	

}
