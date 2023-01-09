package ru.exr.SpringBootExt.dao;


import ru.exr.SpringBootExt.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(Long id);


    void updateUser(User user);

    void deleteUser(Long id);

    void addUser(User user);


}
