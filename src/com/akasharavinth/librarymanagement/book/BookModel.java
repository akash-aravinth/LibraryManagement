package com.akasharavinth.librarymanagement.book;

import com.akasharavinth.librarymanagement.datalayer.LibraryDatamanagement;
import com.akasharavinth.librarymanagement.models.Book;

import java.util.List;

public class BookModel {
    private BookView bookView;

    BookModel(BookView bookView) {
        this.bookView = bookView;
    }


    public void removeBookRequest(int removeId) {
        for (Book b : LibraryDatamanagement.getInstance().getBookList()) {
            if (b.getBookId() == removeId) {
                LibraryDatamanagement.getInstance().removeBook(b);
            }
        }
    }

    public void isBookIsThere(int id) {
        for (Book b : LibraryDatamanagement.getInstance().getBookList()) {
            if (b.getBookId() == id) {
                removeBookRequest(id);
            } else {
                bookView.showAlert("The Book id is Not Exists");
            }
        }
        bookView.manageBookDetails();
    }

    public Book getUpdateBook(int id) {
        Book book = new Book();
        for (Book b : LibraryDatamanagement.getInstance().getBookList()) {
            if (b.getBookId() == id) {
                book = b;
            } else {
                bookView.showAlert("The Book id is Not Exists");
                bookView.manageBookDetails();
            }
        }
        return book;
    }

    public void setUpdateBook(int updateId, String bookName, String bookAuthor, String bookPublication, int noOfBook, String journerBook, int bookVolume) {
        Book book = getUpdateBook(updateId);
        book.setBookId();
        book.setBookName(bookName);
        book.setBookAuthor(bookAuthor);
        book.setBookJourner(journerBook);
        book.setBookPublication(bookPublication);
        book.setNoOfBooks(noOfBook);
        book.setBookVolume(bookVolume);
    }

    public void showAllBooks() {
        LibraryDatamanagement.getInstance().showAllBooks();
    }

    public void bookAlreadyExists(String bookName, String bookAuthor, String bookPublication, int noOfBooks, String bookJourner, int bookVolume) {
        if (LibraryDatamanagement.getInstance().bookAlreadyExists(bookName)) {
            bookView.showAlert("The Book is Already here So can You please Update \n" +
                    "the count of the book");
            bookView.manageBookDetails();
        } else {
            Book book = new Book();
            book.setBookName(bookName);
            book.setBookAuthor(bookAuthor);
            book.setBookVolume(bookVolume);
            book.setBookJourner(bookJourner);
            book.setBookPublication(bookPublication);
            book.setNoOfBooks(noOfBooks);
            LibraryDatamanagement.getInstance().addBook(book);
        }
    }
}
