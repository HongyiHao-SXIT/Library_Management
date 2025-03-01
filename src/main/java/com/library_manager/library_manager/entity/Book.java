package com.library_manager.library_manager.entity;

import java.util.Objects;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String intro;
    private int deposit;
    private boolean isBorrowed = false;

    public Book() {
    }

    public Book(String bookId, String title, String author, String intro, int deposit) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.intro = intro;
        this.deposit = deposit;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIntro() {
        return intro;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getDeposit() {
        return deposit;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", intro='" + intro + '\'' +
                ", deposit=" + deposit +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return deposit == book.deposit &&
                isBorrowed == book.isBorrowed &&
                Objects.equals(bookId, book.bookId) &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(intro, book.intro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title, author, intro, deposit, isBorrowed);
    }
}