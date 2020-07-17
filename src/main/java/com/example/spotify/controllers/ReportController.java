package com.example.spotify.controllers;

import com.example.spotify.entities.Report;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    final JdbcTemplate jdbcTemplate;

    public ReportController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/reportSong")
    public void reportSong(@RequestParam String token, @RequestBody Report report){

    }

}
