package com.akasharavinth.librarymanagement.login;

import com.akasharavinth.librarymanagement.LibraryManagement;

import java.util.Scanner;

public class LoginView {
    private LoginModel loginModel;
    public LoginView(){
        loginModel = new LoginModel(this);
    }
    public void init() {
        System.out.println("Welcome to "+ LibraryManagement.getInstance().getAppName()+" version : "+
                LibraryManagement.getInstance().getAppVersion());
        startLogin();
    }
    public void startLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String userName = scanner.next();
        System.out.println("Enter Your Password : ");
        String password = scanner.next();
        loginModel.validateNamePassword(userName,password);
    }

    public void reLogin(){
        System.out.println("Do you want to Relogin then type Yes or No");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();
        if(option.equalsIgnoreCase("yes")){
            startLogin();
        }else if(option.equalsIgnoreCase("no")){
            System.out.println("Thank You");
        }else{
            showAlert("Please Enter Valid Option");
        }
    }
    public void showAlert(String alert){
        System.out.println(alert);
    }


}
