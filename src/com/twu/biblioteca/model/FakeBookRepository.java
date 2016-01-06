package com.twu.biblioteca.model;

import com.twu.biblioteca.model.data.Book;

import java.util.ArrayList;
import java.util.List;

public class FakeBookRepository implements BookRepository<Book> {

    private List<Book> fakeBooks;

    public FakeBookRepository(List<Book> fakeBooks) {

        this.fakeBooks = fakeBooks;
    }

    public FakeBookRepository() {
        generateFakeBooks();
    }

    @Override
    public List<Book> getAll() {
        return fakeBooks;
    }

    private void generateFakeBooks() {
        fakeBooks = new ArrayList<Book>();

        for (int i = 0; i < 10; i++) {
            Book generatedBook = new Book();
            generatedBook.setCode(i + 1);
            generatedBook.setName("Book " + (i + 1) );
            generatedBook.setAuthor("Author " + (i + 1));
            generatedBook.setAvailable(true);

            fakeBooks.add(generatedBook);
        }

    }

}
