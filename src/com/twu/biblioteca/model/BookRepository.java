package com.twu.biblioteca.model;

import java.util.List;

public interface BookRepository<T> {

    List<T> getAll();

}
