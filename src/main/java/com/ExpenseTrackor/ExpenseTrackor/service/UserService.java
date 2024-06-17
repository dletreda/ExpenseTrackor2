package com.ExpenseTrackor.ExpenseTrackor.service;

import java.util.List;
import java.util.Optional;

import com.ExpenseTrackor.ExpenseTrackor.model.User;

public interface UserService {
    User saveUser(User user);

 

    User updateUser(User user);

    void deleteUserById(int userId);

    List<User> getAllUsers();

    User getUserByUsername(String username);

    void deleteAllUsers();
    Optional<User> findUserById(int id);
}
