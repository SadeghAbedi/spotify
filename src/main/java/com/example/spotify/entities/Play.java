package com.example.spotify.entities;

public class Play {

    private long songId;
    private String player;

    public long getSongId() {
        return songId;
    }

    public void setSongId(long songId) {
        this.songId = songId;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Play(long songId, String player) {
        this.songId = songId;
        this.player = player;
    }

    public Play() {
    }
}
