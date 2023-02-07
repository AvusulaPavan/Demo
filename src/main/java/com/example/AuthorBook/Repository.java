package com.example.AuthorBook;

import java.util.HashMap;
import java.util.Objects;

@org.springframework.stereotype.Repository
public class Repository {

    HashMap<Integer, Book>db=new HashMap<>();
    private int id=1;

    public String addBook(Book book) {
        book.setId(id++);
        db.put(book.getId(),book);
        return "Sussess";
    }

    public String getBookId(int id) {
        if(!db.containsKey(id))
            return "id not found";
        return db.get(id).getName();
    }

    public String updateBook(int id, String name) {

        if(db.containsKey(id)){
            Book book=db.get(id);
            book.setName(name);
            db.put(id, book);
            return "Success";

        }
        return "id not  found";
    }

    public String deleteBool(int id,Book book) {
        for(int k:db.keySet()){
            if(Objects.equals(db.get(k), book)){
                db.remove(id);
                return "Success";
            }
        }
        return "book not found";
    }
}
