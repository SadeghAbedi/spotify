package com.example.spotify.entities;

public class LikePlaylist {
    private String userName;
    private long playlistId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(long playlistId) {
        this.playlistId = playlistId;
    }

    public LikePlaylist(String userName, long playlistId) {
        this.userName = userName;
        this.playlistId = playlistId;
    }

    public LikePlaylist() {
    }
}
