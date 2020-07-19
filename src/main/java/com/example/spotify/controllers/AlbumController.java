package com.example.spotify.controllers;


import com.example.spotify.entities.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;

@RestController
public class AlbumController {

    final JdbcTemplate jdbcTemplate;

    public AlbumController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/addAlbum")
    public void addAlbum(@RequestBody Album album) {
//        String sql = "INSERT INTO album (title,genre,artist,publishDate) VALUES (?,?,?,?)";
//
//        Map<String, Object> parameters = new HashMap<String, Object>();
//        jdbcTemplate.update(sql, album.getTitle(),album.getGenre(),album.getArtist(),album.getPublishDate());
//
    }

    @DeleteMapping("/removeAlbum")
    public void removeAlbum(@RequestParam Long id){
        //Just use id of album
        String sql = "DELETE FROM album WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @DeleteMapping("/removeSongs")
    public void removeSongs(@RequestParam String token,@RequestBody Album album){
        //just delete songs in the songsList in album
    }

}




