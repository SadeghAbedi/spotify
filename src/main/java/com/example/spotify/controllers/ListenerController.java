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
    public void follow(@RequestBody Listener listener){

    }

    @DeleteMapping("/unFollow")
    // delete listener
    public void unFollow(@RequestParam String userName){

    }
}
