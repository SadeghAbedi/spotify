package com.example.spotify.entities;

import java.util.Date;

public class Artist {
    private String userName;
    private String artisticName;
    private String nationality;
    private boolean isVerified;
    private Date startDate;
    private String password;
    private String email;
    private long questionId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getArtisticName() {
        return artisticName;
    }

    public void setArtisticName(String artisticName) {
        this.artisticName = artisticName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public long getQuestionId() {
        return questionId;
    }

    public Artist(String userName, String artisticName, String nationality, boolean isVerified, Date startDate, String password, String email, long questionId) {
        this.userName = userName;
        this.artisticName = artisticName;
        this.nationality = nationality;
        this.isVerified = isVerified;
        this.startDate = startDate;
        this.password = password;
        this.email = email;
        this.questionId = questionId;
    }

    public Artist() {
    }
}
