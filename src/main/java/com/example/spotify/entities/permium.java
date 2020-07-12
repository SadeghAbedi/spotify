package com.example.spotify.entities;

import java.util.Date;

public class permium {

    private long id;
    private long timeDuration;
    private Date buyDate;
    private long creditNum;
    private Date expirationDate;
    private String listener;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(long timeDuration) {
        this.timeDuration = timeDuration;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public long getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(long creditNum) {
        this.creditNum = creditNum;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getListener() {
        return listener;
    }

    public void setListener(String listener) {
        this.listener = listener;
    }

    public permium(long id, long timeDuration, Date buyDate, long creditNum, Date expirationDate, String listener) {
        this.id = id;
        this.timeDuration = timeDuration;
        this.buyDate = buyDate;
        this.creditNum = creditNum;
        this.expirationDate = expirationDate;
        this.listener = listener;
    }

    public permium() {
    }
}
