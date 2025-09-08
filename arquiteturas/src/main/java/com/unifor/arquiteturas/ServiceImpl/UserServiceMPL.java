package com.unifor.arquiteturas.ServiceImpl;

import com.unifor.arquiteturas.Model.User;
import com.unifor.arquiteturas.Repository.UserRepository;
import com.unifor.arquiteturas.Services.UserInterface;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceMPL implements UserInterface {
    private UserRepository

    @Override
    public User createUser(User user) {
        return Repository.save(user);
    }

    @Override
    public List<User> getAllusers() {
        return Repository.findall();
    }

    @Override
    public User getUseByid(long id) {
        Optional<User> user Repository.FindById(id);
        return User.orElse(null);
    }
}
