package com.ExpenseTrackor.ExpenseTrackor.service;
 
import java.util.List;
import java.util.Optional;

import com.ExpenseTrackor.ExpenseTrackor.model.Expense;

public interface ExpenseService {

    Expense saveExpense(Expense expense);

    Expense getExpenseById(int expenseId);

    List<Expense> getAllExpenses();

    void deleteExpense(int expenseId);

    void deleteAllExpenses();

    Expense updateExpense(Expense expense);

 

 
 

    
}
