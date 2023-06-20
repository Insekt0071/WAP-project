package com.uep.wap.service;

import com.uep.wap.model.User;
import com.uep.wap.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create a new user or update an existing user
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Retrieve a user by their ID
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Retrieve all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Delete a user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

