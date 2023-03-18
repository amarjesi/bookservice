package com.bookservice.bookservice.controller;

import com.bookservice.bookservice.domain.Book;
import com.bookservice.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.math.BigInteger;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping (value = "api/v1/book")
    public ResponseEntity <Book> createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @GetMapping (value = "api/v1/book")
    public ResponseEntity<Book> getBookByBookId(@RequestParam BigInteger bookID){
        return bookService.getBookByBookId(bookID);
    }

    @GetMapping (value = "api/v1/book/{bookID}")
    public ResponseEntity<Book> getBook(@PathVariable("bookID") BigInteger bookID){
        return bookService.getBookByBookId(bookID);
    }

    @PatchMapping (value = "api/v1/updateBook")
    public ResponseEntity<Book> updateBookDetails(@RequestBody Book book){
        return bookService.updateBookDetails(book);
    }

}
