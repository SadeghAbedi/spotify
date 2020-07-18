package com.example.spotify.entities;

public class PlayLSong {

    private long songId;
    private long playlistId;

    public long getPlaylistId() {
        return playlistId;
    }

    public long getSongId() {
        return songId;
    }

    public void setPlaylistId(long playlistId) {
        this.playlistId = playlistId;
    }

    public void setSongId(long songId) {
        this.songId = songId;
    }

    public PlayLSong(long playlistId,long songId){
        this.setPlaylistId(playlistId);
        this.setSongId(songId);
    }
}
