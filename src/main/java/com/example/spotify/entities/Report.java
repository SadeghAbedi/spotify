package com.example.spotify.entities;

public class Report {
    
    private String userName;
    private String admin;
    private long songId;
    private String text;

    public long getSongId() {
        return songId;
    }

    public void setSongId(long songId) {
        this.songId = songId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Report(long songId, String userName, String admin, String text) {
        this.songId = songId;
        this.userName = userName;
        this.admin = admin;
        this.text = text;
    }

    public Report() {

    }
}
