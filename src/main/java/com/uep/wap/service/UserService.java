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

    // Create a new user
    public User createUser(User user) {
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
    // Update an existing user
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setFirst_name(userDetails.getFirst_name());
            user.setLast_name(userDetails.getLast_name());
            user.setEmail(userDetails.getEmail());
            user.setPassword(userDetails.getPassword());
            // add any other fields that you want to update
            userRepository.save(user);
        }
        return user;
    }
}

