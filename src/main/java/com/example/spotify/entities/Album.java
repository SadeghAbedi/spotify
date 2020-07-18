package com.example.spotify.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {

    private long id;
    private String title;
    private String genre;
    private String artist;
    private Date publishDate;
    private List<Song> songs;

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

    public Album(long id, String title, String genre, String artist, Date publishDate,List<Song> songs) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.publishDate = publishDate;
        this.songs = songs;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Album() {

    }
}
