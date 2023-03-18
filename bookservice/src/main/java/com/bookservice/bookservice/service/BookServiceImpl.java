package com.bookservice.bookservice.service;

import com.bookservice.bookservice.Repo.BookRepository;
import com.bookservice.bookservice.domain.Book;
import com.bookservice.bookservice.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Objects;

@Service
public class BookServiceImpl implements BookService{

@Autowired
    BookRepository bookRepository;


    @Override
    public ResponseEntity<Book> createBook(Book book) {
        BookEntity bookEntity = convertDomainToEntity(book);
        return ResponseEntity.ok(convertEntityToDomain(bookRepository.save(bookEntity)));
    }

    @Override
    public ResponseEntity<Book> getBookByBookId(BigInteger bookID) {
        return ResponseEntity.ok(convertEntityToDomain(bookRepository.findByBookId(bookID)));
    }

    @Override
    public ResponseEntity<Book> updateBookDetails(Book book) {
        BookEntity bookEntityFromUI = convertDomainToEntity(book);
        BookEntity bookEntity = bookRepository.findByBookId(book.getBookId());
        bookEntityFromUI.setId(bookEntity.getId());
        return ResponseEntity.ok(convertEntityToDomain(bookRepository.save(bookEntityFromUI)));
    }

    private BookEntity convertDomainToEntity(Book book){

        BookEntity bookEntity = new BookEntity();

        if (Objects.nonNull(book)){
            bookEntity.setBookId(book.getBookId());
            bookEntity.setBookAuthor(book.getBookAuthor());
            bookEntity.setBookCategory(book.getBookCategory());
            bookEntity.setBookName(book.getBookName());
            bookEntity.setBookPrice(book.getBookPrice());
            bookEntity.setBookTitle(book.getBookTitle());
            bookEntity.setYearOfBook(book.getYearOfBook());
            bookEntity.setId(book.getId());
        }
        return bookEntity;
    }

    private Book convertEntityToDomain(BookEntity bookEntity){
        Book book = new Book();

        if (null!=bookEntity){
            book.setBookTitle(bookEntity.getBookTitle());
            book.setBookAuthor(bookEntity.getBookAuthor());
            book.setBookPrice(bookEntity.getBookPrice());
            book.setBookName(bookEntity.getBookName());
            book.setBookId(bookEntity.getBookId());
            book.setBookCategory(bookEntity.getBookCategory());
            book.setYearOfBook(bookEntity.getYearOfBook());
            book.setId(bookEntity.getId());
        }
        return book;
    }
}
