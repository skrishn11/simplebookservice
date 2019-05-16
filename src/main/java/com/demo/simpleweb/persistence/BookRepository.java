package com.demo.simpleweb.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.simpleweb.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
