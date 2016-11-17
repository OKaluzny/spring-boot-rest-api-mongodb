package com.kaluzny;

import com.kaluzny.domain.Book;
import com.kaluzny.domain.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    private BookRepository repository;

    @Autowired
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    @Test
    public void createBook() {
        Book book = new Book(3, "Java 8 in Action", "Programming");
       /* Book savedBook = repository.save(book);
        Book newBook = repository.findOne(savedBook.Id());
        assertEquals("Java 8 in Action", newBook.getName());
        assertEquals("Programming", newBook.getDescription());*/
    }

    @Test
    public void findAllBooks() {
        List<Book> books = repository.findAll();
        assertNotNull(books);
        assertTrue(!books.isEmpty());
    }

    @Test
    public void findBookById() {
        Book book = repository.findOne(1);
        assertNotNull(book);
    }

    @Test
    public void deleteBookWithId() {
        Book book = repository.findOne(1);
        repository.delete(book);
        assertNotNull(book);
    }
}