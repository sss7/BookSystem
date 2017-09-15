package com.BS;

import com.BS.entity.Book;
import com.BS.entity.BookStore;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Set;


public class HibernateExample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

//        Book book = new Book("Thinking", "Bruce", 50);
//        session.save(book);

        Book book = session.get(Book.class, 32);
//        Book book1 = session.load(Book.class, 1);
        System.out.println(book);

//        book.setBookPrice(100);
//        System.out.println(book);


//        BookStore bookStore = session.get(BookStore.class, 1);
//        System.out.println(bookStore);
//        Set<Book> books = bookStore.getBooks();
//        for (Book book : books) {System.out.println(book);}



//        Query query = session.createQuery("from BookStore");
//        List<BookStore> bookStores = query.getResultList();

        transaction.commit();

        session.close();
        sessionFactory.close();

    }
}
