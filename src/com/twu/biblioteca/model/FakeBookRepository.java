package com.twu.biblioteca.model;

import com.twu.biblioteca.model.BookRepository;
import com.twu.biblioteca.model.data.Book;

import java.util.List;

public class FakeBookRepository implements BookRepository<Book> {

    private List<Book> fakeBooks;

    public FakeBookRepository(List<Book> fakeBooks) {
        this.fakeBooks = fakeBooks;
    }


    @Override
    public List<Book> getAll() {
        return fakeBooks;
    }


}
