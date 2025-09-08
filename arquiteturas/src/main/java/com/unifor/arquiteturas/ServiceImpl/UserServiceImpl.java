package com.unifor.arquiteturas.ServiceImpl;

import com.unifor.arquiteturas.Model.User;
import com.unifor.arquiteturas.Repository.UserRepository;
import com.unifor.arquiteturas.Services.UserInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserInterface {

    private final UserRepository userRepository;

    // injeção via construtor
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
