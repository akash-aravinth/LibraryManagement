package com.akasharavinth.librarymanagement.librarysetup;

import com.akasharavinth.librarymanagement.datalayer.LibraryDatamanagement;
import com.akasharavinth.librarymanagement.models.Library;

import java.util.Scanner;

public class LibrarySetupView {
    private LibrarySetupModel librarySetupModel;
    public LibrarySetupView(){
        librarySetupModel = new LibrarySetupModel(this);
    }

    public void init() {
       librarySetupModel.startSetup();
    }

    public void onSetupComplete(Library library){
        System.out.println("\nLibrary setup completed\n");
        System.out.println("\nCurrent Library Name - " + library.getLibraryName());
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(
                    "\n 1. Add Book\n 2. Add user \n 3. Search Book \n 9. Logout \n 0. Exit \n Enter your Choice:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 : {
                    System.out.println("add Book");
                    break;
                }
                default:{
                    System.out.println("Default");
                    break;
                }
            }
        }
    }


    public void initiateSetup() {
        System.out.println("Enter Library Details : ");
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Enter Library Name : ");
        library.setLibraryName(scanner.next());
        System.out.println("Enter Library Id : ");
        library.setLibraryId(scanner.nextInt());
        System.out.println("Enter Library Address : ");
        library.setLibraryAddress(scanner.next());
        System.out.println("Enter Library PhoneNo : ");
        library.setLibraryPhoneNo(scanner.nextLong());
        System.out.println("Enter Library EmailId : ");
        library.setLibraryEmailId(scanner.next());
        librarySetupModel.createLibrary(library);
    }


    public void showAlert(String enterValidName) {
    }

}
