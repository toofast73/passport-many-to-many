package com.example.demo.service;

import com.example.demo.model.Passport;
import com.example.demo.model.User;
import com.example.demo.repository.PassportRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportService {

    @Autowired
    private PassportRepository passportRepository;


    public Passport save(Passport user){
        return passportRepository.save(user);
    }

    public Passport get(Long id){
        return passportRepository.getOne(id);
    }

    public List<Passport> getAll(){
        return passportRepository.findAll();
    }

}
