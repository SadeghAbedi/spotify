package com.example.spotify.controllers;

import com.example.spotify.entities.Listener;
import com.example.spotify.entities.Song;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ListenerController {

    final JdbcTemplate jdbcTemplate;


    public ListenerController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/follow")
    public void follow(@RequestParam String token, @RequestBody Listener listener){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "INSERT INTO follow (userName1,userName2) VALUES (?,?)";
        jdbcTemplate.update(sql,userName,listener.getUserName());
    }

    @DeleteMapping("/unFollow")
    // delete listener
    public void unFollow(@RequestParam String token, @RequestBody Listener listener){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        String sql = "DELETE FROM follow WHERE userName1=? and userName2=?";
        jdbcTemplate.update(sql,userName,listener.getUserName());

    }
}
