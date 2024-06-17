 package com.ExpenseTrackor.ExpenseTrackor.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ExpenseTrackor.ExpenseTrackor.model.Expense;
import com.ExpenseTrackor.ExpenseTrackor.service.ExpenseService;
 

@RestController
 
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/expense")
    public ResponseEntity<Expense> saveUser(@RequestBody Expense expense) {
        Expense savedExpense = expenseService.saveExpense(expense);
        return new ResponseEntity<Expense>(savedExpense, HttpStatus.CREATED);
    }

    @GetMapping("/expense")
    public ResponseEntity<List<Expense>> getAllExpense() {
        List<Expense> expenses = expenseService.getAllExpenses();
        return new ResponseEntity<>(expenses, HttpStatus.OK);
    }

    @GetMapping("/expense/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable("id") int id) {
    	Expense expense = expenseService.getExpenseById(id);
        return new ResponseEntity<>(expense, HttpStatus.OK);
    }

    @PutMapping("/expense/{id}")
    public ResponseEntity<Expense> updateExpense(@PathVariable("id") int id, @RequestBody Expense expense) {
     
    	Expense updatedExpense = expenseService.updateExpense(expense);
        return new ResponseEntity<>(updatedExpense, HttpStatus.OK);
    }

    @DeleteMapping("/expense/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable("id") int id) {
    	expenseService.deleteExpense(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
