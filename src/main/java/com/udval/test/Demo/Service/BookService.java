package com.udval.test.Demo.Service;

import com.udval.test.Demo.Entity.Book;
import com.udval.test.Demo.Repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
