package com.BS.entity;

import javax.persistence.*;


@NamedQueries({
        @NamedQuery(
            name = "getBookById",
            query = "from books b where b.id = :id"
        )
})

@Entity
@Table//(name = "books")
public class Book {
    @Id
//    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "BOOK_TITLE")
    private String BookName;

    @Column(name = "BOOK_AUTHOR")
    private String BookAuthor;

    @Column(name = "BOOK_Price")
    private int BookPrice;

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

    public int getBokPrice() {
        return BookPrice;
    }

    public void setBokPrice(int bokPrice) {
        BookPrice = bokPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", BookName='" + BookName + '\'' +
                ", BookAuthor='" + BookAuthor + '\'' +
                ", BokPrice=" + BookPrice +
                '}';
    }
}
