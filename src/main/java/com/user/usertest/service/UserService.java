package com.user.usertest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.usertest.dto.UserDTO;
import com.user.usertest.model.User;
import com.user.usertest.repository.UserRepository;
import com.user.usertest.exception.NotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found"));
        return UserDTO.toDTO(user);
    }
    
}
