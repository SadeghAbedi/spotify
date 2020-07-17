package com.example.spotify.controllers;

import com.example.spotify.entities.Listener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class ListenerController {

    final JdbcTemplate jdbcTemplate;


    public ListenerController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/follow")
    public void follow(@RequestParam String token, @RequestBody Listener listener){

    }

    @DeleteMapping("/unFollow")
    public void unFollow(@RequestParam String token, @RequestBody Listener listener){
        
    }
}
