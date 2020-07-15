package com.example.spotify.controllers;


import com.example.spotify.Customer;
import com.example.spotify.entities.Album;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlbumController {
    @PostMapping("/addAlbum")
    public Album addAlbum(@RequestParam String token, @RequestBody Album album){
//returnesho pak kon! mese demoController :D
return album;
    }

    @DeleteMapping("/removeAlbum")
    public void removeAlbum(@RequestParam String token,@RequestBody Album album){
        //Just use id of album
    }



}
