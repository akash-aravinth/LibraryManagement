package com.akasharavinth.librarymanagement.librarysetup;

import com.akasharavinth.librarymanagement.models.Library;

public class LibrarySetupModel {
    private Library library;

    private LibrarySetupView librarySetupView;
    LibrarySetupModel(LibrarySetupView librarySetupView){
        this.librarySetupView = librarySetupView;
    }

    
}
