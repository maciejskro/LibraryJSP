package pl.sda.library.service;

import pl.sda.library.entity.Author;

import java.util.List;

public interface IAuthorService {

    List<Author> findAllAuthors();

}
