package com.example.AuthorBook;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;

    public String addBook(Book book){
        return repository.addBook(book);
    }
    public String getBookId(int id){
        return repository.getBookId(id);
    }
    public String updateBook(int id, String name){
        return repository.updateBook(id,name);
    }
    public String deleteBook(int id,Book book){
        return repository.deleteBool(id,book);
    }

}
