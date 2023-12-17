package com.example.hh.Services.impl;

import com.example.hh.Entities.UserEntity;
import com.example.hh.Repository.UserRepository;
import com.example.hh.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(UserEntity user) {
        userRepository.save(user);
    }
}
