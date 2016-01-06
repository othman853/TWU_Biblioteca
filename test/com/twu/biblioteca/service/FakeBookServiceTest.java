package com.twu.biblioteca.service;

import com.twu.biblioteca.model.BookRepository;
import com.twu.biblioteca.model.FakeBookRepository;
import com.twu.biblioteca.model.data.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FakeBookServiceTest {

    private List<Book> allBooks;

    private BookRepository<Book> repository;
    private BookService<Book> bookService;

    @Before
    public void setUp() {

        generateBooks();


        allBooks = new ArrayList<Book>();

        repository = new FakeBookRepository(allBooks);
        bookService = new BookServiceImplementation(repository);

    }

    @Test
    public void getAll_ShouldReturnAllBooks() {
        List<Book> expectedResult = allBooks;

        List<Book> actualResult = bookService.getAll();


    }

    private void generateBooks() {
        allBooks = new ArrayList<Book>();

        for (int i = 0; i < 10; i++) {
            Book generatedBook = new Book();
            generatedBook.setCode(i + 1);
            generatedBook.setName("Book " + (i + 1) );
            generatedBook.setAuthor("Author " + (i + 1));
            generatedBook.setAvailable(true);

            allBooks.add(generatedBook);
        }

    }


}
