package com.akasharavinth.librarymanagement.models;

public class User {
    private int userId;
    private String userName;
    private long userPhoneNo;
    private String userEmailId;
    private String userAddress;
    private boolean userMembership;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public boolean isUserMembership() {
        return userMembership;
    }

    public void setUserMembership(boolean userMembership) {
        this.userMembership = userMembership;
    }
}
