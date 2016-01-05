package com.twu.biblioteca.app;

import com.twu.biblioteca.model.BookRepository;
import com.twu.biblioteca.model.FakeBookRepository;
import com.twu.biblioteca.model.data.Book;
import com.twu.biblioteca.service.BookService;
import com.twu.biblioteca.service.FakeBookService;

public class BibliotecaApp {

    private BookService<Book> bookService;


    public static void main(String[] args) {

        BookRepository<Book> repository = new FakeBookRepository();

        BookService<Book> service = new FakeBookService(repository);

        BibliotecaApp app = new BibliotecaApp(service);

        app.start();
    }


    public BibliotecaApp(BookService<Book> bookService) {
        this.bookService = bookService;
    }

    public void start() {
        welcome();
    }

    public void welcome() {
        System.out.println("Hello, welcome to Biblioteca!");

    }

}
