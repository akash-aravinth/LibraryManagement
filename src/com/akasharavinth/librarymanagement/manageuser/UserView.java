package com.akasharavinth.librarymanagement.manageuser;

import com.akasharavinth.librarymanagement.datalayer.LibraryDatamanagement;
import com.akasharavinth.librarymanagement.librarysetup.LibrarySetupView;
import com.akasharavinth.librarymanagement.models.User;

import java.util.Scanner;

public class UserView {
    private UserModel userModel;
    Scanner scanner = new Scanner(System.in);

    public UserView() {
        userModel = new UserModel(this);
    }

    public void init() {
        System.out.println("Give User Details ");
        collectUserDetails();
    }

    public void manageUser(){
        System.out.println("Now You are Access to add User");
        System.out.println("1.Add User\n2.Remove User\n3.Update User\n4.Show Users\n5.Go Back");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 : {
                collectUserDetails();
                break;
            }
            case 2 : {
                System.out.println("Remove");
                break;
            }
            case 3 : {
                System.out.println("Update");
                break;
            }
            case 4 :{
                LibraryDatamanagement.getInstance().showUsers();
                break;
            }
            default:{
                System.out.println("Please Enter Valid Choice");
                LibrarySetupView librarySetupView = new LibrarySetupView();
                librarySetupView.gettingChoices();
                break;
            }
        }
    }

    public void collectUserDetails() {
        System.out.println("Enter UserName : ");
        String userName = scanner.next();
        System.out.println("Enter UserPassword : ");
        String userPassword = scanner.next();
        System.out.println("Enter User PhoneNo : ");
        long userPhoneNo = scanner.nextLong();
        System.out.println("Enter User MainId : ");
        String userMailId = scanner.next();
        System.out.println("Enter User Address : ");
        String userAddress = scanner.next();
        userModel.setUserDetails(userName,userPassword,userPhoneNo,userMailId,userAddress);
        collectAnotherUser();
    }
    public void collectAnotherUser(){
        System.out.println("Do You want add one more user then type Yes or type No ");
        String choice = scanner.next();
        if(choice.equalsIgnoreCase("yes")){
            collectUserDetails();
        }else if(choice.equalsIgnoreCase("no")){
            manageUser();
        }else{
            System.out.println("Please Enter Valid choice");
            collectAnotherUser();
        }
    }
}
