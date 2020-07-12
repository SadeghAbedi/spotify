package com.example.spotify.entities;

public class Question {

    private long id;
    private String qText;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public Question(long id, String qText) {
        this.id = id;
        this.qText = qText;
    }

    public Question() {
    }
}
