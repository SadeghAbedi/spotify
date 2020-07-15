package com.example.spotify.controllers;


import com.example.spotify.Customer;
import com.example.spotify.entities.Album;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {
    @PostMapping("/addAlbum")
    public Album addAlbum(@RequestParam String token, @RequestBody Album album){
//returnesho pak kon! mese demoController :D
return album;
    }
}
