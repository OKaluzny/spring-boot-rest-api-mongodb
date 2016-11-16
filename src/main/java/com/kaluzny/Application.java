package com.kaluzny;

import com.kaluzny.domain.Book;
import com.kaluzny.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {

        bookRepository.save(new Book(1, "Java SE", "Programming"));
        bookRepository.save(new Book(2, "prasad", "prasad@gmail.com"));
    }
}