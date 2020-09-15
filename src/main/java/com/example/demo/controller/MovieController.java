package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.model.Passport;
import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movie")
    public List<Movie> getAll(){
        List<Movie> all = movieService.getAll();
        return all;
    }
}
