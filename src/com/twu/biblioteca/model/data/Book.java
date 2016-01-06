package com.twu.biblioteca.model.data;

/**
 * Created by yrachid on 1/5/16.
 */
public class Book {

    private int code;
    private String name;
    private String author;
    private int publishYear;
    private boolean available;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return  code + ": " +
                "Name: " + name +
                ", Author:" + author +
                ", Year:" + publishYear;
    }
}
