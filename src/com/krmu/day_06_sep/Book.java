package com.krmu.day_06_sep;

public class Book {
    public String title;
    public String author;
    public String ISBN;
    public boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }
}

