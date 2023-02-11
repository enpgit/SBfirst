package ru.ep.springbootexsample.movetosb.service;

import ru.ep.springbootexsample.movetosb.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

}
