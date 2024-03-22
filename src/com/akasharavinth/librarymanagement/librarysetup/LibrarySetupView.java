package com.akasharavinth.librarymanagement.librarysetup;

import com.akasharavinth.librarymanagement.models.Library;

import java.util.Scanner;

public class LibrarySetupView {
    private LibrarySetupModel librarySetupModel;
    public LibrarySetupView(){
        librarySetupModel = new LibrarySetupModel(this);
    }

}
