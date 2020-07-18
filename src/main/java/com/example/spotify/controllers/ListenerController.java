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
        String sql = "INSERT INTO listener (userName,firstName,lastName,nationality,birthYear) VALUES (?,?,?,?,?)";

        Map<String, Object> parameters = new HashMap<String, Object>();
        jdbcTemplate.update(sql, listener.getUserName(),listener.getFirstName(),listener.getLastName(),listener.getNationality(),listener.getBirthYear());
    }

    @DeleteMapping("/unFollow")
    // delete listener
    public void unFollow(@RequestParam String userName){
        String sql = "DELETE FROM listener WHERE userName=?";
        jdbcTemplate.update(sql, userName);
        
    }
}
