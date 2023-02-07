package com.example.AuthorBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    Service service;
    @PostMapping("/add_book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        String msg=service.addBook(book);
        return new ResponseEntity<>(msg, HttpStatus.CREATED);
    }
    @GetMapping("/get_book")
    public ResponseEntity<String>getBookByid(@RequestParam("q") int id){
        return new ResponseEntity<>(service.getBookId(id),HttpStatus.CREATED);
    }
    @PutMapping("/update_book")
    public ResponseEntity<String> updateBook(@RequestParam("id")int id, @RequestParam("name") String name){
        return new ResponseEntity<>(service.updateBook(id,name),HttpStatus.CREATED);
    }
    @DeleteMapping("/delete_book")
    public ResponseEntity<String> deleteBook(@RequestParam("id") int id,@RequestParam("book") Book book){
        return new ResponseEntity<>(service.deleteBook(id,book),HttpStatus.CREATED);
    }

}
