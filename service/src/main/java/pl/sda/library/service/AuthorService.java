package pl.sda.library.service;

import pl.sda.library.entity.Author;
import pl.sda.library.model.AuthorRepository;
import pl.sda.library.model.IBaseRepository;

import java.util.List;

public class AuthorService implements IAuthorService {

    private IBaseRepository<Author> authorRepository;

    public AuthorService() {
        this.authorRepository = new AuthorRepository();
    }

    @Override
    public List<Author> findAllAuthors() {
        return this.authorRepository.findAll();
    }

}
