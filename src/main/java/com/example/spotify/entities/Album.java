package com.example.spotify.entities;

import java.util.Date;

public class Album {

    private long id;
    private String title;
    private String gener;
    private String artist;
    private Date publishDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Album(long id, String title, String gener, String artist, Date publishDate) {
        this.id = id;
        this.title = title;
        this.gener = gener;
        this.artist = artist;
        this.publishDate = publishDate;
    }

    public Album() {
    }
}
