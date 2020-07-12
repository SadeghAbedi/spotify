package com.example.spotify.entities;

public class Song {
    private long id;
    private long albumId;
    private String title;
    private long duration;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Song(long id, long albumId, String title, long duration) {
        this.id = id;
        this.albumId = albumId;
        this.title = title;
        this.duration = duration;
    }

    public Song() {
    }
}
