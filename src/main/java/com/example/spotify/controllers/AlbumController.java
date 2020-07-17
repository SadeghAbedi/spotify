package com.example.spotify.controllers;


import com.example.spotify.Customer;
import com.example.spotify.entities.Album;
import com.example.spotify.entities.Song;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlbumController {

    final JdbcTemplate jdbcTemplate;

    public AlbumController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @PostMapping("/addAlbum")
    public Album addAlbum(@RequestParam String token, @RequestBody Album album){
//returnesho pak kon! mese demoController :D
return album;
    }

    @DeleteMapping("/removeAlbum")
    public void removeAlbum(@RequestParam String token,@RequestBody Album album){
        //Just use id of album
    }

    @DeleteMapping("/removeSong")
    public void removeSong(@RequestParam String token, @RequestBody Song song){
        //just delete songs in the songsList in album
    }

    @GetMapping("/getAlbum")
    public void getAlbum(@RequestParam String token, @RequestBody Album album){
        //Just use id of album
    }


}
