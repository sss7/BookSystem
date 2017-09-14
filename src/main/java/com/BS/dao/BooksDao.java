package com.BS.dao;

import com.BS.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BooksDao {

    private List<Book> books = Arrays.asList(
            new Book(1,"title1", "author1", 55),
            new Book(2,"title2", "author2", 555),
            new Book(3,"title3", "author3", 53),
            new Book(4,"title4", "author4", 54),
            new Book(5,"title5", "author5", 5555));

    public List<Book> getAllBooks() {
        return books;
    }



}
