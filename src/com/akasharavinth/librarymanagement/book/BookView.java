package com.akasharavinth.librarymanagement.book;

import com.akasharavinth.librarymanagement.datalayer.LibraryDatamanagement;
import com.akasharavinth.librarymanagement.librarysetup.LibrarySetupView;
import com.akasharavinth.librarymanagement.models.Book;

import java.util.Scanner;

public class BookView {
    private BookModel bookModel;
    Scanner scanner = new Scanner(System.in);
    public BookView(){
        bookModel = new BookModel(this);
    }
    public void init() {
        showAlert("Enter The Book Details");
        manageBookDetails();
    }

    public void showAlert(String alert) {
        System.out.println(alert);
    }

    public void manageBookDetails(){
        System.out.println("1 -->  Add Book \n2 --> Remove Book\n3 --> Update Book\n4 --> Show Books" +
                "\n5 --> Search Book "+"\n6 --> Go Back \n");
        int choice = scanner.nextInt();
        while (true){
            switch (choice){
                case 1 : {
                    gettingBookDetails();
                    break;
                }
                case 2 :{
                    removeBookView();
                    break;
                }
                case 3 : {
                    updateBookView();
                    break;
                }
                case 4 : {
                    showAllBooks();
                    manageBookDetails();
                    break;
                }
                case 5 :{
                    System.out.println("Search Book");
                    manageBookDetails();
                    break;
                }
                case 6 : {
                    LibrarySetupView librarySetupView = new LibrarySetupView();
                    librarySetupView.gettingChoices();
                    break;
                }
                default:{
                    showAlert("Please Enter Valid Option");
                    manageBookDetails();
                }
            }
        }
    }

    public void gettingBookDetails() {
        System.out.println("Enter Book Name : ");
        String bookName = scanner.next();
        System.out.println("Enter Book Author : ");
        String bookAuthor = scanner.next();
        System.out.println("Book Publication : ");
        String bookPublication = scanner.next();
        System.out.println("Enter Total No of Books : ");
        int noOfBooks = scanner.nextInt();
        System.out.println("Enter Book Journer : ");
        String bookJourner = scanner.next();
        System.out.println("Enter the Volume of Books : ");
        int bookVolume = scanner.nextInt();
        bookModel.bookAlreadyExists(bookName,bookAuthor,bookPublication,noOfBooks,bookJourner,bookVolume);
        addMoreBook();
    }
    public void addMoreBook(){
        System.out.println("Do You Want add More Book \n Type Yes for add BOOK type No for GO Back");
        String choice = scanner.next();
        if(choice.equalsIgnoreCase("yes")){
            gettingBookDetails();
        }else if(choice.equalsIgnoreCase("no")){
            manageBookDetails();
        }else {
            showAlert("Please Enter Valid Choice :");
        }
    }
    public void removeBookView(){
        System.out.println("Please Enter Book Id for Remove the Book ");
        int removeId = scanner.nextInt();
        bookModel.isBookIsThere(removeId);
    }
    public void updateBookView(){
        System.out.println("Please Enter Book Id for Remove the Book ");
        int updateId = scanner.nextInt();
        System.out.println("Enter Update BookName : ");
        String bookName = scanner.next();
        System.out.println("Enter Update Book Author : ");
        String bookAuthor = scanner.next();
        System.out.println("Enter Update Book Publication : ");
        String bookPublication = scanner.next();
        System.out.println("Enter Update No Of Book : ");
        int noOfBook = scanner.nextInt();
        System.out.println("Enter Update Journer Book");
        String journerBook = scanner.next();
        System.out.println("Enter Update Volume Book ");
        int bookVolume = scanner.nextInt();
        bookModel.setUpdateBook(updateId,bookName,bookAuthor,bookPublication,noOfBook,journerBook,bookVolume);
        System.out.println("BookUpdate Successfully \n\n");
        manageBookDetails();
    }
    public void showAllBooks(){
        bookModel.showAllBooks();
    }
}
