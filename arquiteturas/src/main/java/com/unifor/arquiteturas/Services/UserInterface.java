package com.unifor.arquiteturas.Services;

import com.unifor.arquiteturas.Model.User;

import java.util.List;

public interface UserInterface {
    public User createUser(User user);
    public List<User> getAllusers();
    public User getUseByid(long id);
}
