package com.hejcl.app.rest.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "author")
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;
    @Column
    private String surname;

    /**
    public Author(Author author) {
        name = author.getName();
        surname = author.getSurname();
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
     */
}
