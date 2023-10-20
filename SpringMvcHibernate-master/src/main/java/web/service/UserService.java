package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User readUser(int id);


    void deleteUser(int id);

    User saveUser(User user);
    User updateUser(User user);
}
