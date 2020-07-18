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
    public void likeSong( @RequestBody Song song){
        String sql = "INSERT INTO song (albumId,title,duration) VALUES (?,?,?)";

        Map<String, Object> parameters = new HashMap<String, Object>();
        jdbcTemplate.update(sql, song.getAlbumId(),song.getTitle(),song.getDuration());
    }


    @DeleteMapping("/unlikeSong")
    public void unlikeSong(@RequestParam Long id){
        String sql = "DELETE FROM song WHERE id=?";
        jdbcTemplate.update(sql, id);
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
