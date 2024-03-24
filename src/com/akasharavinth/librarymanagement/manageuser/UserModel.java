package com.akasharavinth.librarymanagement.manageuser;

import com.akasharavinth.librarymanagement.LibraryManagement;
import com.akasharavinth.librarymanagement.datalayer.LibraryDatamanagement;
import com.akasharavinth.librarymanagement.models.User;

public class UserModel {
    private UserView userView;
    UserModel(UserView userView){
        this.userView = userView;
    }

    public void setUserDetails(String userName, String userPassword, long userPhoneNo, String userMailId, String userAddress) {
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserEmailId(userMailId);
        user.setUserAddress(userAddress);
        user.setUserPhoneNo(userPhoneNo);
        LibraryDatamanagement.getInstance().addUserToList(user);
        System.out.println("User Successfully Added");
    }
}
