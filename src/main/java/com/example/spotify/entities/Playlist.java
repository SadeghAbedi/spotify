package com.example.spotify.entities;

import java.util.Date;

public class Playlist {
    private long id;
    private String title;
    private String creator;

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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Playlist(long id, String title, String creator) {
        this.id = id;
        this.title = title;
        this.creator = creator;
    }

    public Playlist() {
    }
}
