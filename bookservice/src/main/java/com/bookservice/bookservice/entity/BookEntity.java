package com.bookservice.bookservice.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table (name = "BOOK")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column (name = "BOOK_ID")
    private BigInteger bookId;

    @Column (name = "BOOK_NAME")
    private String bookName;

    @Column (name = "BOOK_TITLE")
    private String bookTitle;

    @Column (name = "BOOK_AUTHOR")
    private String bookAuthor;

    @Column (name = "BOOK_PRICE")
    private BigInteger bookPrice;

    @Column (name = "BOOK_CATEGORY")
    private String bookCategory;

    @Column (name = "YEAR_OF_BOOK")
    private BigInteger yearOfBook;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigInteger getBookId() {
        return bookId;
    }

    public void setBookId(BigInteger bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public BigInteger getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigInteger bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public BigInteger getYearOfBook() {
        return yearOfBook;
    }

    public void setYearOfBook(BigInteger yearOfBook) {
        this.yearOfBook = yearOfBook;
    }
}
