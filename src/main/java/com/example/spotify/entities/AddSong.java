package com.example.spotify.entities;

import java.util.Date;

public class AddSong {

    private String userName;
    private long songId;
    private long playlistId;
    private Date addDate;

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

    public long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(long playlistId) {
        this.playlistId = playlistId;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public AddSong(String userName, long songId, long playlistId, Date addDate) {
        this.userName = userName;
        this.songId = songId;
        this.playlistId = playlistId;
        this.addDate = addDate;
    }

    public AddSong() {
    }
}
