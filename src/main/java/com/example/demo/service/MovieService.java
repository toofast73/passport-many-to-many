package com.example.demo.service;

import com.example.demo.repository.MovieRepository;
import com.example.demo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }

    public Movie get(Long id){
        return movieRepository.getOne(id);
    }

    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

}
