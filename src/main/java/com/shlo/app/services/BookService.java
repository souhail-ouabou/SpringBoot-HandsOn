package com.shlo.app.services;

import com.shlo.app.domain.entites.BookEntity;

import java.util.List;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);

    List<BookEntity> findAll();
}

