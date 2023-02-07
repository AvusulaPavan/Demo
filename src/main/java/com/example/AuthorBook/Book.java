package com.example.AuthorBook;

public class Book {
    private int id;
    private String name;
    private String author;
    private int noofpages;

    public Book() {
    }

    public Book(String name, String author, int noofpages) {
        this.name = name;
        this.author=author;
        this.noofpages = noofpages;
    }

    public Book(int id, String name, String author, int noofpages) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.noofpages = noofpages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoofpages() {
        return noofpages;
    }

    public void setNoofpages(int noofpages) {
        this.noofpages = noofpages;
    }
}
