package com.example.spotify.entities;

import java.util.Date;

public class Listener {
    private String userName;
    private String firstName;
    private String lastName;
    private String nationality;
    private Date birthYear;
    private String password;
    private String email;
    private long questionId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Date birthYear) {
        this.birthYear = birthYear;
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

    public Listener(String userName, String firstName, String lastName, String nationality, Date birthYear, String password, String email, long questionId) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.birthYear = birthYear;
        this.password = password;
        this.email = email;
        this.questionId = questionId;
    }

    public Listener() {
    }
}
