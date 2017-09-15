package com.BS.entity;

import javax.persistence.*;


//@NamedQueries({
//        @NamedQuery(
//            name = "getBookById",
//            query = "from books b where b.id = :id"
//        )
//})

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private int id;

    @Column(name = "BOOK_TITLE")
    private String BookName;

    @Column(name = "BOOK_AUTHOR")
    private String BookAuthor;

    @Column(name = "BOOK_PRICE")
    private int BookPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookstore_id")
    private BookStore bookStore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publisher_id")
    private Publisher publisher;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, int bookPrice) {
        BookName = bookName;
        BookAuthor = bookAuthor;
        BookPrice = bookPrice;
    }

    public Book(int id, String bookName, String bookAuthor, int bokPrice) {
        this.id = id;
        BookName = bookName;
        BookAuthor = bookAuthor;
        BookPrice = bokPrice;
    }

    public Book(String bookName, String bookAuthor, int bookPrice, BookStore bookStore, Publisher publisher) {
        BookName = bookName;
        BookAuthor = bookAuthor;
        BookPrice = bookPrice;
        this.bookStore = bookStore;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int bookPrice) {
        BookPrice = bookPrice;
    }

    public BookStore getBookStore() {
        return bookStore;
    }

    public void setBookStore(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", BookName='" + BookName + '\'' +
                ", BookAuthor='" + BookAuthor + '\'' +
                ", BookPrice=" + BookPrice +
                ", bookStore=" + bookStore +
                ", publisher=" + publisher +
                '}';
    }
}
