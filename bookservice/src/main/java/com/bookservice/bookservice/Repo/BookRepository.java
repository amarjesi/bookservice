package com.bookservice.bookservice.Repo;

import com.bookservice.bookservice.domain.Book;
import com.bookservice.bookservice.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Long> {
    public BookEntity findByBookId(BigInteger bookId);


}

