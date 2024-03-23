package com.akasharavinth.librarymanagement.login;

import com.akasharavinth.librarymanagement.librarysetup.LibrarySetupView;

public class LoginModel {
    private LoginView loginView;

    public LoginModel(LoginView loginView) {
        this.loginView = loginView;
    }

    public void validateNamePassword(String userName, String password) {
        if(validUserName(userName)){
            if(validPassword(password)){
                loginView.showAlert("Login Successfully");
                LibrarySetupView librarySetupView = new LibrarySetupView();
                librarySetupView.init();
            }else{
                loginView.showAlert("Invalid Password");
                loginView.reLogin();
            }
        }else{
            loginView.showAlert("Invalid Username");
            loginView.reLogin();
        }
    }
    public boolean validPassword(String password){
        return password.equals("admin");
    }
    public boolean validUserName(String userName){
        return userName.equals("zsgs");
    }

}
