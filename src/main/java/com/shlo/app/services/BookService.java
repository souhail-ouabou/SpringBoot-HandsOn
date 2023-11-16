package com.shlo.app.services;

import com.shlo.app.domain.entites.BookEntity;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);
}

