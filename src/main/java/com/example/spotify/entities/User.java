package com.example.spotify.entities;

public class User {
    private String userName;
    private String password;
    private String email;
    private long questionId;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public User(String userName, String password, String email, long questionId) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.questionId = questionId;
    }

    public User() {
    }
}
