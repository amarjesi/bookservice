package com.bookservice.bookservice.domain;

import java.math.BigInteger;

public class Book {
    private long id;
    private BigInteger bookId;
    private String bookName;
    private String bookTitle;
    private String bookAuthor;
    private BigInteger bookPrice;
    private String bookCategory;
    private BigInteger yearOfBook;

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

    public void setBookAuthor(String bookAuthor) {this.bookAuthor = bookAuthor;}

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setYearOfBook(BigInteger yearOfBook) {
        this.yearOfBook = yearOfBook;
    }

    public Book() {
    }
}
