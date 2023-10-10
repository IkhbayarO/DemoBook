package com.udval.test.Demo.Controller;

import com.udval.test.Demo.Entity.Book;
import com.udval.test.Demo.Service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/books")
public class BookController {
    @Autowired
    private BookServiceImpl bookServiceImpl;


    @PostMapping(path = "/addBook", headers = "Accept=application/json")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        bookServiceImpl.addBook(book);
        return new ResponseEntity<>(book, HttpStatus.OK);

    }

    @GetMapping(path = "/getBooks", headers = "Accept=application/json")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> books = bookServiceImpl.getBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
