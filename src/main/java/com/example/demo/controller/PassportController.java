package com.example.demo.controller;

import com.example.demo.model.Passport;
import com.example.demo.model.User;
import com.example.demo.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassportController {

    @Autowired
    private PassportService passportService;


    @GetMapping("/passport")
    public List<Passport> getAll(){
        List<Passport> all = passportService.getAll();
        return all;
    }
}
