package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Passport> passports;

    @ManyToMany
    @JsonIgnoreProperties("watchers")
    private List<Movie> library;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Passport> getPassports() {
        return passports;
    }

    public void setPassports(List<Passport> passports) {
        this.passports = passports;
    }

    public List<Movie> getLibrary() {
        return library;
    }

    public void setLibrary(List<Movie> library) {
        this.library = library;
    }


}
