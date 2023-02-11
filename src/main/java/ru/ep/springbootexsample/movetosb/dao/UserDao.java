package ru.ep.springbootexsample.movetosb.dao;



import ru.ep.springbootexsample.movetosb.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUser(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);
}
