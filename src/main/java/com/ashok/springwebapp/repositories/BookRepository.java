package com.ashok.springwebapp.repositories;

import com.ashok.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by ashok jung bahadur
 */

public interface BookRepository extends CrudRepository<Book,Long> {
}
