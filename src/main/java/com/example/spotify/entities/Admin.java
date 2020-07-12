package com.example.spotify.entities;

public class Admin {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Admin(String userName) {
        this.userName = userName;
    }

    public Admin() {
    }
}
