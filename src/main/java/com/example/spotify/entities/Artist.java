package com.example.spotify.entities;

import java.util.Date;

public class Artist {
    private String userName;
    private String artisticName;
    private String nationality;
    private boolean isVerified;
    private Date startDate;

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

    public Artist(String userName, String artisticName, String nationality, boolean isVerified, Date startDate) {
        this.userName = userName;
        this.artisticName = artisticName;
        this.nationality = nationality;
        this.isVerified = isVerified;
        this.startDate = startDate;
    }

    public Artist() {
    }
}
