package com.example.spotify.entities;

import java.util.Date;

public class Play {

    private long songId;
    private String player;
    private Date playDate;

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

    public Date getPlayDate() {
        return playDate;
    }

    public void setPlayDate(Date playDate) {
        this.playDate = playDate;
    }

    public Play(long songId, String player, Date playDate) {
        this.songId = songId;
        this.player = player;
        this.playDate= playDate;
    }

    public Play() {
    }
}
