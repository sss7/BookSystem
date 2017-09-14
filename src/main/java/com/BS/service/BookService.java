package com.BS.service;

import com.BS.dao.BooksDao;
import com.BS.entity.Book;
import com.BS.entity.TextRes;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.sql.SQLException;
import java.util.List;

@Service
public class BookService {


    @Autowired
    private BooksDao booksDao;
    private TextRes textRes;

    @Autowired
    public void setTextRes(TextRes textRes) {
        this.textRes = textRes;
    }

    public String textMessage() {
        return textRes.message();
    }

    public Book textMessageGetFirst(int id) {
        for (Book book : booksDao.getAllBooks()) {
            if (book.getId() == id) {
                return book;
            }
        }

        return null; //booksDao.getAllBooks().get(id);
    }

    public List getAllBooks() {
        return booksDao.getAllBooks();
    }




//    @Autowired
//    private BooksDao booksDao;

//    public List getAll(String namedHQL) throws SQLException {
//        openTransactionSession();
//        Session session = getSession();
//        Query query = session.createNamedQuery(namedHQL);
//        List list = query.list();
//        closeTransactionSession();
//        return list;
//    }

//    public Book getBookById(int id, String namedQuerry) throws SQLException, NoResultException {
//        openTransactionSession();
//        Session session = getSession();
//        org.hibernate.query.Query query = session.createNamedQuery(namedQuerry);
////        Query query = getSession().createNamedQuery(namedQuerry);
//        query.setParameter("id", id);
//        Book obj = (Book) query.getSingleResult();
//        closeTransactionSession();
//        return obj;
//    }
//
//    public Session openSession() {
//        return getSessionFactory().openSession();
//    }
//
//    public Session openTransactionSession() {
//        session = openSession();
//        transaction = session.beginTransaction();
//        return session;
//    }
//
//    private static final SessionFactory sessionFactory = buildSessionFactory();
//    private Session session;
//    private Transaction transaction;
//
//    private static SessionFactory buildSessionFactory() {
//        try {
//            return new Configuration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            System.out.println("Initial session failed" + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//
//    public Session getSession() {
//        return session;
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//    public void closeTransactionSession() {
//        transaction.commit();
//        closeSession();
//    }
//
//    public void closeSession() {
//        session.close();
//    }

}
