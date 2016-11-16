package com.kaluzny.domain;

public class Book {

    private Long id;
    private String name;
    private String description;

    public Book(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}