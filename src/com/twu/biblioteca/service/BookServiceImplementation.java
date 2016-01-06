package com.twu.biblioteca.service;

import com.twu.biblioteca.model.BookRepository;
import com.twu.biblioteca.model.data.Book;

import java.util.List;

public class BookServiceImplementation implements BookService<Book>{

    private BookRepository<Book> repository;

    public BookServiceImplementation(BookRepository<Book> repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAll() {
        return repository.getAll();
    }

}
