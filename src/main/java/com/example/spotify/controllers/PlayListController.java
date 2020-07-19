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
import java.util.Date;
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

        jdbcTemplate.update(sql,playlist.getTitle(),playlist.getCreator());

    }

    @DeleteMapping("/deletePlayList")
    public void delPlayList(@RequestParam Long id){
        String sql = "DELETE FROM playlist WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @PostMapping("/addListener")
    //share playlist
    public void addListener(@RequestParam String token, @RequestBody PlayLListener playLListener){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "INSERT INTO share_playlist (playlistId,userName1,userName2) VALUES (?,?,?)";
        jdbcTemplate.update(sql, playLListener.getPlaylistId(),userName,playLListener.getListenerId());
    }

    @DeleteMapping("/deleteListener")
    public void delListener(@RequestParam String token, @RequestBody PlayLListener playLListener){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "DELETE  FROM share_playlist WHERE playlistId=? and userName1=? and userName2=?";
        jdbcTemplate.update(sql, playLListener.getPlaylistId(),userName,playLListener.getListenerId());

    }

    @PostMapping("/addSong")
    public void addSong( @RequestParam String token, @RequestBody PlayLSong playLSong){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "INSERT INTO add_song (userName,songId,playlistId,addDate) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,userName, playLSong.getSongId(),playLSong.getPlaylistId(), new Date(System.currentTimeMillis()));

    }
    @DeleteMapping("/deleteSong")
    public void delSong(@RequestParam String token, @RequestBody PlayLSong playLSong){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "DELETE  FROM add_song where userName=? and songId=? and playlistId=? ";
        jdbcTemplate.update(sql,userName, playLSong.getSongId(),playLSong.getPlaylistId());

    }

    @PostMapping("/likePlayList")
    public void likePlayList(@RequestParam String token, @RequestBody Playlist playlist){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "INSERT INTO like_playlist (userName,playlistId) VALUES (?,?)";
        jdbcTemplate.update(sql,userName, playlist.getId());

    }

    @DeleteMapping("/unlikePlayList")
    public void unlikePlayList(@RequestParam String token, @RequestBody Playlist playlist){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "DELETE  FROM like_playlist WHERE userName=? and playlistId=?";
        jdbcTemplate.update(sql,userName, playlist.getId());

    }
}
