package com.akasharavinth.librarymanagement.models;

public class Book {
    private static long id = 0;
    private String bookName;
    private String bookAuthor;
    private String bookPublication;
    private static long bookId;
    private String bookEdition;
    private boolean bookAvailability;
    private String bookJourner;
    private int bookVolume;

    public long getId(){
        return id;
    }
    public void setId(){
        id++;
    }
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

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookEdition() {
        return bookEdition;
    }

    public void setBookEdition(String bookEdition) {
        this.bookEdition = bookEdition;
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
