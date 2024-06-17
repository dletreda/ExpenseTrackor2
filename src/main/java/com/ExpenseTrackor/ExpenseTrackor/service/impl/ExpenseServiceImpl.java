package com.ExpenseTrackor.ExpenseTrackor.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExpenseTrackor.ExpenseTrackor.dao.ExpenseDao;
import com.ExpenseTrackor.ExpenseTrackor.model.Expense;
import com.ExpenseTrackor.ExpenseTrackor.service.ExpenseService;
import com.ExpenseTrackor.ExpenseTrackorExceptions.ExpenseNotFoundException;

@Service
public class ExpenseServiceImpl implements ExpenseService  {

    @Autowired
    private ExpenseDao expenseDao;

    @Override
    public Expense saveExpense(Expense expense) {
        return expenseDao.save(expense);
    }

    @Override
    public Expense getExpenseById(int expenseId) {
        Optional<Expense> expense = expenseDao.findById(expenseId);
        if (expense.isPresent()) {
            return expense.get();
        } else {
            throw new ExpenseNotFoundException("Expense not found with ID: " + expenseId);
        }
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseDao.findAll();
    }

    @Override
    public   void deleteExpense(int expenseId) {
        if (expenseDao.existsById(expenseId)) {
            expenseDao.deleteById(expenseId);
        } else {
            throw new ExpenseNotFoundException("Cannot delete. Expense not found with ID: " + expenseId);
        }
    }

    @Override
    public void deleteAllExpenses() {
        expenseDao.deleteAll();
    }

    @Override
    public Expense updateExpense(Expense expense) {
        if (expenseDao.existsById(expense.getExpenseId())) {
            return expenseDao.save(expense);
        } else {
            throw new ExpenseNotFoundException("Cannot update. Expense not found with ID: " + expense.getExpenseId());
        }
    }

	 

    
}
