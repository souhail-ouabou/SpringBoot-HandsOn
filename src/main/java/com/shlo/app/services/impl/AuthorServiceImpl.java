package com.shlo.app.services.impl;

import com.shlo.app.domain.entites.AuthorEntity;
import com.shlo.app.repositories.AuthorRepository;
import com.shlo.app.services.AuthorService;
import org.springframework.stereotype.Service;


@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;


    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
       return authorRepository.save(authorEntity);

    }
}
