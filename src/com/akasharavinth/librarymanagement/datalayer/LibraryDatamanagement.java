package com.akasharavinth.librarymanagement.datalayer;

import com.akasharavinth.librarymanagement.models.Book;
import com.akasharavinth.librarymanagement.models.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatamanagement {
    List<Book> bookList = new ArrayList<>();
    public static LibraryDatamanagement libraryDatamanagement;
    private Library library;

    public static LibraryDatamanagement getInstance() {
        if (libraryDatamanagement == null) {
            libraryDatamanagement = new LibraryDatamanagement();
        }
        return libraryDatamanagement;
    }

    public Library getLibrary() {
        return library;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(int bookId) {
        for (Book b : bookList) {
            if (b.getBookId() == bookId) {
                bookList.remove(b);
            }
        }
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Library insertLibrary(Library library2) {
        this.library = library2;
        this.library.setLibraryId(1);
        return library;
    }


}
