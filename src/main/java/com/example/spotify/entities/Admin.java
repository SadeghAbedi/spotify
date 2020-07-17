package com.example.spotify.entities;

public class Admin {

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

    public long getQuestionId() {
        return questionId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public Admin(String userName, String password, String email, long questionId) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.questionId = questionId;
    }

    public Admin() {
    }
}
