package com.example.spotify.controllers;


import com.example.spotify.entities.PlayLListener;
import com.example.spotify.entities.PlayLSong;
import com.example.spotify.entities.Playlist;
import com.example.spotify.entities.Song;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayListController {

    final JdbcTemplate jdbcTemplate;

    public PlayListController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @PostMapping("/addPlayList")
    public void addPlayList(@RequestParam String token, @RequestBody Playlist playlist){

    }

    @DeleteMapping("/deletePlayList")
    public void delPlayList(@RequestParam String token, @RequestBody Playlist playlist){

    }

    @PostMapping("/addListener")
    public void addListener(@RequestParam String token, @RequestBody PlayLListener playLListener){

    }

    @DeleteMapping("/deleteListener")
    public void delListener(@RequestParam String token, @RequestBody PlayLListener playLListener){

    }

    @PostMapping("/addSong")
    public void addSong(@RequestParam String token, @RequestBody PlayLSong playLSong){
        //add song and date
    }
    @DeleteMapping("/deleteSong")
    public void delSong(@RequestParam String token, @RequestBody PlayLSong playLSong){

    }

    @PostMapping("/likePlayList")
    public void likePlayList(@RequestParam String token, @RequestBody Playlist playlist){

    }

    @DeleteMapping("/unlikePlayList")
    public void unlikePlayList(@RequestParam String token, @RequestBody Playlist playlist){

    }
}
