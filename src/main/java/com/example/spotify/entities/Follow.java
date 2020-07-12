package com.example.spotify.entities;

public class Follow {

    private String userName1;
    private String userName2;

    public String getUserName1() {
        return userName1;
    }

    public void setUserName1(String userName1) {
        this.userName1 = userName1;
    }

    public String getUserName2() {
        return userName2;
    }

    public void setUserName2(String userName2) {
        this.userName2 = userName2;
    }

    public Follow(String userName1, String userName2) {
        this.userName1 = userName1;
        this.userName2 = userName2;
    }

    public Follow() {
    }
}
