package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User save(User user){
        return userRepository.save(user);
    }

    public User get(Long id){
        return userRepository.getOne(id);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
