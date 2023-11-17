package com.shlo.app.services;

import com.shlo.app.domain.entites.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    AuthorEntity save(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();
    Optional<AuthorEntity> findOne(Long id);

}