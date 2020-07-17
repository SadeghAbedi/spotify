package com.example.spotify.controllers;

import com.example.spotify.entities.Album;
import com.example.spotify.entities.Song;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {

    final JdbcTemplate jdbcTemplate;


    public SongController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/likeSong")
    public void likeSong(@RequestParam String token, @RequestBody Song song){

    }

    @DeleteMapping("/unlikeSong")
    public void unlikeSong(@RequestParam String token, @RequestBody Song song){

    }

    @PostMapping("/getSong")
    public Song getSong(@RequestParam String token, @RequestBody Song song){
    //add date to play relation
        return song;
    }


}
