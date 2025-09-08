package com.unifor.arquiteturas.Services;

import com.unifor.arquiteturas.Model.User;

import java.util.List;

public interface UserInterface {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
}
