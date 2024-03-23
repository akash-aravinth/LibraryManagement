package com.akasharavinth.librarymanagement;

import com.akasharavinth.librarymanagement.login.LoginView;
import com.akasharavinth.librarymanagement.models.Library;

public class LibraryManagement {
    private static LibraryManagement libraryManagement;
    public static LibraryManagement getInstance(){
        if(libraryManagement == null)
            libraryManagement = new LibraryManagement();
        return libraryManagement;
    }
    private String appName = "Library Management";
    private String appVersion = "0.1.0";
    public String getAppName(){
        return appName;
    }
    public String getAppVersion(){
        return appVersion;
    }
    public void init(){
        LoginView loginView = new LoginView();
        loginView.init();
    }

    public static void main(String[] args) {
        LibraryManagement.getInstance().init();
        Library library = new Library();
        System.out.println(library.getLibraryName());
    }
}
