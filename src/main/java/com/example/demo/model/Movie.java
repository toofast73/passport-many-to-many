package com.example.demo.model;

import com.example.demo.model.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    @JsonIgnoreProperties("library")
    private List<User> watchers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getWatchers() {
        return watchers;
    }

    public void setWatchers(List<User> watchers) {
        this.watchers = watchers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
