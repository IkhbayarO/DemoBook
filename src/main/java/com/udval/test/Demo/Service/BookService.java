package com.udval.test.Demo.Service;

import com.udval.test.Demo.Entity.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> getBooks();
}
