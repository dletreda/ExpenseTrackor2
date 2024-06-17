package com.ExpenseTrackor.ExpenseTrackor.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ExpenseTrackor.ExpenseTrackor.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    User findByUserId(int userId);

    User findByUsername(String username);
}
