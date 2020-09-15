package com.example.demo.controller;

import com.example.demo.model.Passport;
import com.example.demo.model.User;
import com.example.demo.service.MovieService;
import com.example.demo.service.PassportService;
import com.example.demo.service.UserService;
import com.example.demo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    PassportService passportService;

    @Autowired
    MovieService movieService;

    @GetMapping("/user")
    public List<User> getAll(){
        List<User> all = userService.getAll();
        return all;
    }

    @GetMapping("/userSave")
    public User saveTest(){
        User user = new User();
        user.setName("Vlad");

        Passport passport = new Passport();
        passport.setNumber("123");
        passportService.save(passport);

        user.setPassports(List.of(passport));

        passport.setOwner(user);
        User save = userService.save(user);

        return save;
    }


    @GetMapping("/userMovieSave")
    public User saveMovie(){
        User user = new User();
        user.setName("Vlad");

        Movie titanic = new Movie();
        titanic.setName("Titanic");


        Movie inception = new Movie();
        inception.setName("Inception");


        movieService.save(titanic);
        movieService.save(inception);

        user.setLibrary(List.of(titanic, inception));
        inception.setWatchers(List.of(user));
        titanic.setWatchers(List.of(user));

        User save = userService.save(user);

        return save;
    }


}
