package com.shlo.app.services;

import com.shlo.app.domain.entites.AuthorEntity;

import java.util.List;

public interface AuthorService {
    AuthorEntity save(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();
}