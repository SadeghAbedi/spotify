package com.example.spotify.entities;

public class PlayLSong {

    private long songId;
    private long playLostId;

    public long getPlayLostId() {
        return playLostId;
    }

    public long getSongId() {
        return songId;
    }

    public void setPlayLostId(long playLostId) {
        this.playLostId = playLostId;
    }

    public void setSongId(long songId) {
        this.songId = songId;
    }
    public PlayLSong(long playLostId,long songId){
        this.setPlayLostId(playLostId);
        this.setSongId(songId);
    }
}
