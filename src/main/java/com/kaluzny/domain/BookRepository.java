package com.kaluzny.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository extends MongoRepository<Book, Integer> {

    List<Book> findByName(String name);
}