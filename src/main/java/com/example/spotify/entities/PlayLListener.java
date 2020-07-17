package com.example.spotify.entities;

public class PlayLListener {

    private long playlistId;
    private long listenerId;

    public long getListenerId() {
        return listenerId;
    }

    public long getPlaylistId() {
        return playlistId;
    }

    public void setListenerId(long listenerId) {
        this.listenerId = listenerId;
    }

    public void setPlaylistId(long playlistId) {
        this.playlistId = playlistId;
    }
    public PlayLListener(long playlistId,long listenerId){
        this.listenerId = listenerId;
        this.playlistId = playlistId;
    }
}
