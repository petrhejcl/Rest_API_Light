package com.hejcl.app.rest.model.repository;

import com.hejcl.app.rest.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
