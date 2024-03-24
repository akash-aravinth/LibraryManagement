package com.akasharavinth.librarymanagement.models;

import com.akasharavinth.librarymanagement.datalayer.LibraryDatamanagement;

public class User {
    private static int id = LibraryDatamanagement.getInstance().getUserList().size();
    private static int userId = id;
    private String userPassword;
    private String userName;
    private long userPhoneNo;
    private String userEmailId;
    private String userAddress;

    public User(){
        id++;
    }

    public String getUserPassword(){
        return userPassword;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }

    public int getUserId() {
        return userId;
    }

//    public void setUserId() {
//        this.userId = id;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserPhoneNo() {
        return userPhoneNo;
    }

    public void setUserPhoneNo(long userPhoneNo) {
        this.userPhoneNo = userPhoneNo;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

}
