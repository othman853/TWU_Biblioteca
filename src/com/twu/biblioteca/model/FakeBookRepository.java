package com.twu.biblioteca.model;

import com.twu.biblioteca.model.data.Book;

import java.util.ArrayList;
import java.util.List;

public class FakeBookRepository implements BookRepository<Book> {

    private List<Book> fakeBooks;

    public FakeBookRepository() {

        fakeBooks = new ArrayList<Book>();

    }

    @Override
    public List<Book> getAll() {
        return fakeBooks;
    }

}
