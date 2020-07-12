package com.example.spotify.entities;

public class LikeSong {

    private String userName;
    private long songId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getSongId() {
        return songId;
    }

    public void setSongId(long songId) {
        this.songId = songId;
    }

    public LikeSong(String userName, long songId) {
        this.userName = userName;
        this.songId = songId;
    }

    public LikeSong() {
    }
}
