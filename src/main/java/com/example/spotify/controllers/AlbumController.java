package com.example.spotify.controllers;


import com.example.spotify.entities.Album;
import com.example.spotify.entities.Listener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AlbumController {

    final JdbcTemplate jdbcTemplate;

    public AlbumController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/addAlbum")
    public void addAlbum(@RequestParam String token, @RequestBody Album album) {
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token}, ((rs, rows) -> rs.getString("userName")));

        String sql = "INSERT INTO album (title,genre,artist,publishDate,songs) VALUES (?,?,?,?,?)";
        album.getSongs().forEach((song) -> jdbcTemplate.update(
                sql,
                album.getTitle(),
                album.getGenre(),
                userName,
                new Date(System.currentTimeMillis()), album.getSongs()));

    }

    @DeleteMapping("/removeAlbum")
    public void removeAlbum(@RequestBody Album album) {
        //Just use id of album
        String sql = "DELETE FROM album WHERE id=?";
        jdbcTemplate.update(sql, album.getId());
        sql = "DELETE FROM song WHERE albumId=?";
        jdbcTemplate.update(sql, album.getId());

    }

    @DeleteMapping("/removeSongs")
    public void removeSongs(@RequestParam String token, @RequestBody Album album) {
        //just delete songs in the songsList in album
        album.getSongs().forEach((song -> jdbcTemplate.update("DELETE FROM song WHERE id=?", song.getId())));
    }

}




