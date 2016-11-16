package com.kaluzny.web;

import com.kaluzny.domain.Book;
import com.kaluzny.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookRepository repository;

    @Autowired
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        repository.save(book);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id}")
    public Book getBookWithId(@PathVariable Integer id) {

        return repository.findOne(id);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "/{id}")
    public void deleteBookWithId(@PathVariable int id) {
        repository.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllBooks() {
        repository.deleteAll();
    }
}