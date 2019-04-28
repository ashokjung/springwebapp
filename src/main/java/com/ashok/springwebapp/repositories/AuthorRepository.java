package com.ashok.springwebapp.repositories;

import com.ashok.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;



/**
 * Created by ashok jung bahadur
 */

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
