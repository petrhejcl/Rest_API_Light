package com.hejcl.app.rest.controller;

import com.hejcl.app.rest.model.entity.Author;
import com.hejcl.app.rest.model.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping(value = "/")
    public String getPage() {
        return "Woooo";
    }

    @GetMapping(value = "/authors")
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }
}
