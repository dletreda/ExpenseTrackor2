package com.ExpenseTrackor.ExpenseTrackor.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExpenseTrackor.ExpenseTrackor.dao.UserDao;
import com.ExpenseTrackor.ExpenseTrackor.model.User;
import com.ExpenseTrackor.ExpenseTrackor.service.UserService;
import com.ExpenseTrackor.ExpenseTrackorExceptions.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public Optional<User> findUserById(int id) {
        Optional<User> user = userDao.findById(id);
        if (user.isPresent()) {
            return Optional.of(user.get());
        } else {
            throw new UserNotFoundException("User not found with ID: " + id);
        }
    }

    @Override
    public User updateUser(User user) {
        if (userDao.existsById(user.getUserId())) {
            return userDao.save(user);
        } else {
            throw new UserNotFoundException("Cannot update. User not found with ID: " + user.getUserId());
        }
    }

    @Override
    public void deleteUserById(int id) {
        if (userDao.existsById(id)) {
            userDao.deleteById(id);
        } else {
            throw new UserNotFoundException("Cannot delete. User not found with ID: " + id);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userDao.findAll();
    }

    @Override
    public User getUserByUsername(String username) {
        Optional<User> user = Optional.of(userDao.findByUsername(username));
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new UserNotFoundException("User not found with username: " + username);
        }
    }

    @Override
    public void deleteAllUsers() {
        userDao.deleteAll();
    }
}
