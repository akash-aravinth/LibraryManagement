package com.akasharavinth.librarymanagement.models;

import com.akasharavinth.librarymanagement.datalayer.LibraryDatamanagement;

public class Book {
    private static long id = LibraryDatamanagement.getInstance().getBookList().size();
    private String bookName;
    private String bookAuthor;
    private String bookPublication;
    private static long bookId;
    private int noOfBooks;
    private boolean bookAvailability;
    private String bookJourner;
    private int bookVolume;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublication() {
        return bookPublication;
    }

    public void setBookPublication(String bookPublication) {
        this.bookPublication = bookPublication;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId() {
        this.bookId = id++;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int no) {
        noOfBooks += no;
    }

    public boolean isBookAvailability() {
        return bookAvailability;
    }

    public void setBookAvailability(boolean bookAvailability) {
        this.bookAvailability = bookAvailability;
    }

    public String getBookJourner() {
        return bookJourner;
    }

    public void setBookJourner(String bookJourner) {
        this.bookJourner = bookJourner;
    }

    public int getBookVolume() {
        return bookVolume;
    }

    public void setBookVolume(int bookVolume) {
        this.bookVolume = bookVolume;
    }
}
