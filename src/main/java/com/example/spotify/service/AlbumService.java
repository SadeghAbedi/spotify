package com.example.spotify.service;

import com.example.spotify.entities.Album;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class AlbumService {
    private  int idCount =1;
    private List<Album> albumList = new CopyOnWriteArrayList<>();

    public Album addAlbum(Album album) {
        album.setId(idCount);
        albumList.add(album);
        idCount++;
        return album;
    }

}
