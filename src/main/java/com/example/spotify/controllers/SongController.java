package com.example.spotify.controllers;

import com.example.spotify.entities.Song;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

@RestController
public class SongController {

    final JdbcTemplate jdbcTemplate;


    public SongController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/likeSong")
    public void likeSong(@RequestParam String token, @RequestBody Song song){

        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "INSERT INTO like_song (userName,songId) VALUES (?,?)";
        jdbcTemplate.update(sql, userName,song.getId());
    }


    @DeleteMapping("/unlikeSong")
    public void unlikeSong(@RequestParam String token, @RequestBody Song song){

        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "DELETE FROM like_song WHERE songId=? and userName=?";
        jdbcTemplate.update(sql,song.getId(),userName);
    }

    @GetMapping("/getSong")
    public List<Song> getSong(@RequestParam Long id){
    //add date to play relation
        return jdbcTemplate.query(
                "SELECT id, albumId, title, duration FROM song where id=?",
                new Object[]{id},
//                (rs, rowNum) -> new Song(rs.getLong("id"),rs.getLong("albumId"), rs.getString("title"), rs.getLong("duration"))
                new BeanPropertyRowMapper(Song.class)
        );
    }


}
