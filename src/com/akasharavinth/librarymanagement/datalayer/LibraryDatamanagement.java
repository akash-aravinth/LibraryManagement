package com.akasharavinth.librarymanagement.datalayer;

import com.akasharavinth.librarymanagement.models.Book;
import com.akasharavinth.librarymanagement.models.Library;
import com.akasharavinth.librarymanagement.models.User;

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
        System.out.println("Book Added Successfully");
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Library insertLibrary(Library library2) {
        this.library = library2;
        this.library.setLibraryId(1);
        return library;
    }

    public boolean bookAlreadyExists(String bookName){
        for (Book b : bookList){
            if(b.getBookName().equals(bookName)){
                return true;
            }
        }
        return false;
    }

    public void showAllBooks() {
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-10s -%20s %-10s","BookId","BookName","Book Author","Book Publication","No Of Books","Book Journer","BookVolume");
        for (Book b : bookList){
            System.out.println(b.getBookName()+"   "+b.getBookId());
//            System.out.format(Long.toString(b.getBookId()),b.getBookName(),b.getBookAuthor(),b.getBookPublication(),b.getNoOfBooks(),b.getBookJourner(),b.getBookVolume());
//            System.out.println();
        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------------");
    }






    List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public void addUserToList(User u){
        userList.add(u);
    }
    public boolean userNameAlreadyExits(String userName){
        for (User u : userList){
            if(u.equals(userName)){
                return false;
            }
        }
        return true;
    }
    public void showUsers(){
        for (User u : userList){
            System.out.println(u.getUserId()+" "+u.getUserName()+" "+u.getUserAddress());
        }
    }
}
