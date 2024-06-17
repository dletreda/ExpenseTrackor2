package com.ExpenseTrackor.ExpenseTrackor.dao;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ExpenseTrackor.ExpenseTrackor.model.Expense;

@Repository
public interface ExpenseDao extends JpaRepository<Expense, Integer> {
 
 
}
