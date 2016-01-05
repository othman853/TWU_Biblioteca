package com.twu.biblioteca.service;

import com.twu.biblioteca.model.BookRepository;
import com.twu.biblioteca.model.data.Book;

import java.util.List;

public class FakeBookService implements BookService<Book>{

    private BookRepository<Book> repository;

    public FakeBookService(BookRepository<Book> repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public List<Book> getAllAvailable() {
        return null;
    }

}
