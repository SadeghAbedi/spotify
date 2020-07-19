package com.example.spotify.controllers;

import com.example.spotify.entities.Artist;
import com.example.spotify.entities.Listener;
import com.example.spotify.entities.Song;
import com.example.spotify.entities.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    final JdbcTemplate jdbcTemplate;

    public SearchController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("artistGenre")
    public List<String> artistGenre(@RequestParam String token, @RequestBody Artist artist){

        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        return jdbcTemplate.query(
                 "SELECT album.genre FROM album WHERE  album.artist=? GROUP BY album.genre HAVING COUNT (album.id) >= ALL ( SELECT COUNT (album.id) FROM album WHERE  album.artist=? GROUP BY album.genre)\n",
                new Object[]{artist.getUserName(),artist.getUserName()},
                new BeanPropertyRowMapper(String.class));


    }

    @GetMapping("fallowerC")
    public List<Integer> fallowerCount (@RequestParam String token, @RequestBody User user){

        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        return jdbcTemplate.query(
                "SELECT COUNT(follow.userName2)\n" +
                        "FROM follow\n" +
                        "WHERE follow.userName1=?\n" +
                        "GROUP BY follow.userName2\n",
        new Object[]{user.getUserName()},
                new BeanPropertyRowMapper(Integer.class));
    }

    @GetMapping("fallowingC")
    public List<Integer> fallowingCount (@RequestParam String token, @RequestBody User user){

        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        return jdbcTemplate.query(
                "SELECT COUNT(follow.userName1)\n" +
                        "FROM follow\n" +
                        "WHERE follow.userName2=?\n" +
                        "GROUP BY follow.userName1\n",
                new Object[]{user.getUserName()},
                new BeanPropertyRowMapper(Integer.class));
    }


}
