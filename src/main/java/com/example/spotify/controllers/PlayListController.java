package com.example.spotify.controllers;


import com.example.spotify.entities.PlayLListener;
import com.example.spotify.entities.PlayLSong;
import com.example.spotify.entities.Playlist;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;

@RestController
public class PlayListController {

    final JdbcTemplate jdbcTemplate;

    public PlayListController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @PostMapping("/addPlayList")
    public void addPlayList( @RequestBody Playlist playlist){
        String sql = "INSERT INTO playlist (title, creator) VALUES (?,?)";

        Map<String, Object> parameters = new HashMap<String, Object>();
        jdbcTemplate.update(sql,playlist.getTitle(),playlist.getCreator());

    }

    @DeleteMapping("/deletePlayList")
    public void delPlayList(@RequestParam Long id){
        String sql = "DELETE FROM playlist WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @PostMapping("/addListener")
    public void addListener(@RequestParam String token, @RequestBody PlayLListener playLListener){

    }

//    @DeleteMapping("/deleteListener")
//    public void delListener(@RequestParam String token, @RequestBody PlayLListener playLListener){
//
//    }

    @PostMapping("/addSong")
    public void addSong( @RequestBody PlayLSong playLSong){
        //add song and date
//        String sql = "INSERT INTO playLSong (songId,playlistId) VALUES (?songId,?playlistId)";
//
//        Map<String, Object> parameters = new HashMap<String, Object>();
//        parameters.put("songId",playLSong.getSongId());
//        parameters.put("playlistId",playLSong.getPlaylistId());
//        jdbcTemplate.update(sql, parameters);


    }
//    @DeleteMapping("/deleteSong")
//    public void delSong(@RequestParam String token, @RequestBody PlayLSong playLSong){
//
//    }

    @PostMapping("/likePlayList")
    public void likePlayList(@RequestParam String token, @RequestBody Playlist playlist){

    }

//    @DeleteMapping("/unlikePlayList")
//    public void unlikePlayList(@RequestParam String token, @RequestBody Playlist playlist){
//
//    }
}
