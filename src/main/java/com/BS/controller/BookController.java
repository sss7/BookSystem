package com.BS.controller;

import com.BS.entity.Book;
import com.BS.service.BookService;
//import org.hibernate.query.Query;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.NoResultException;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @RequestMapping(path = "/book", method = RequestMethod.GET) //produces = "text/plain"
    public String textMessage() {
        return bookService.textMessage();
    }


//    @RequestMapping(path = "/book/get/{id}", method = RequestMethod.GET) //produces = "text/plain"
//    public Book textMessageGetFirst(int id) {
//        return bookService.textMessageGetFirst(id);
//    }

    @RequestMapping(value = "/book/get/{id}", method = RequestMethod.GET) //produces = "text/plain"
    public Book textMessageGetFirst(@PathVariable int id) {
        return bookService.textMessageGetFirst(id);
    }

    @RequestMapping(path = "/book/list", method = RequestMethod.GET) //produces = "text/plain"
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }




//    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
//    public Book getBookById(@PathVariable int id) {
//
//        try {
//            return bookService.getBookById(id, "getBookById");
//        } catch (SQLException e ){
//            System.out.println("SQLException!!!");
//        } catch (Exception e) {
//            System.out.println("Exception!!!");
//        }
//
//        return new Book(55, "title", "author", 55);
//
//    }



}
