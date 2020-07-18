package com.example.spotify.entities;

public class PlayLListener {

    private long playlistId;
    private String listenerId;

    public String getListenerId() {
        return listenerId;
    }

    public long getPlaylistId() {
        return playlistId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public void setPlaylistId(long playlistId) {
        this.playlistId = playlistId;
    }
    public PlayLListener(long playlistId,String listenerId){
        this.listenerId = listenerId;
        this.playlistId = playlistId;
    }
}
