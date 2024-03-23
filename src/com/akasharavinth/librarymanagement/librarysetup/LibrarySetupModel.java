package com.akasharavinth.librarymanagement.librarysetup;

import com.akasharavinth.librarymanagement.datalayer.LibraryDatamanagement;
import com.akasharavinth.librarymanagement.models.Library;

public class LibrarySetupModel {


    private Library library;

    private LibrarySetupView librarySetupView;
    LibrarySetupModel(LibrarySetupView librarySetupView){
        this.librarySetupView = librarySetupView;
        library = LibraryDatamanagement.getInstance().getLibrary();
    }
    public void startSetup() {
        if (library == null || library.getLibraryId() == 0) {
            librarySetupView.initiateSetup();
        } else {
            librarySetupView.onSetupComplete(library);
        }
    }

    public void createLibrary(Library library) {
        if (library.getLibraryName().length() <3  || library.getLibraryName().length() > 50) {
            librarySetupView.showAlert("Enter valid name");
            return;
        }


        this.library = LibraryDatamanagement.getInstance().insertLibrary(library);
        librarySetupView.onSetupComplete(library);
    }
}
