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
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        jdbcTemplate.update("INSERT INTO report (userName,songId,text) VALUES (?,?,?)",userName,report.getSongId(),report.getText());
    }

    @PostMapping("/checkSong")
    public void checkSong(@RequestParam String token, @RequestBody Report report){
        var userName = jdbcTemplate.query("SELECT userName FROM token WHERE token =?",
                new Object[]{token},((rs,rows) -> rs.getString("userName")));

        jdbcTemplate.update("UPDATE report SET admin=? WHERE userName=? and songId=?",userName,report.getUserName(),report.getSongId());
    }

}
