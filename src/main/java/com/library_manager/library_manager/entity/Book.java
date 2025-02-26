package com.library_manager.library_manager.entity;

public class Book {
    private String id_book;
    private String title;
    private String author;
    private String intro;
    private int deposit;
    private boolean isborrow = false;

    public void setId_book(String id_book) {
        this.id_book = id_book;
    }

    public String getId_book() {
        return id_book;
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

    public void borrowed() {
        isborrow = true;
    }

    public void returned() {
        isborrow = false;
    }
}