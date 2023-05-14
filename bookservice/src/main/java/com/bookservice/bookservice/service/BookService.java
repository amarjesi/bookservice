package com.bookservice.bookservice.service;

import com.bookservice.bookservice.domain.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public interface BookService {
   public ResponseEntity<Book> createBook(Book book);

   public ResponseEntity<Book> getBookByBookId(BigInteger bookID);

    public ResponseEntity<Book> updateBookDetails(Book book);

    ResponseEntity<Book> getBookByAuthorCategory(String bookAuthor, String bookCategory, String uuidAsString);
}  
