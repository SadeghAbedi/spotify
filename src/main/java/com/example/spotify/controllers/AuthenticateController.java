package com.example.spotify.controllers;

import com.example.spotify.entities.Admin;
import com.example.spotify.entities.Artist;
import com.example.spotify.entities.Listener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticateController {

    final JdbcTemplate jdbcTemplate;

    public AuthenticateController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/adminRegister")
    public void adminReg(@RequestBody Admin admin){
        String sql = "INSERT INTO admin (userName) VALUES (?)";

        jdbcTemplate.update(sql, admin.getUserName());

    }

    @PostMapping("/artistRegister")
    public void artistReg(@RequestBody Artist artist){
        String sql = "INSERT INTO artist (userName,artisticName,nationality,isVerified,startDate) VALUES (?,?,?,?,?)";

        jdbcTemplate.update(sql,artist.getUserName(),artist.getArtisticName(),artist.getNationality(),artist.isVerified(),artist.getStartDate());

    }

    @PostMapping("/listenerRegister")
    public void listenerReg(@RequestBody Listener listener){
        String sql = "INSERT INTO listener (userName,firstName,lastName,nationality,birthYear) VALUES (?,?,?,?,?)";

        jdbcTemplate.update(sql, listener.getUserName(),listener.getFirstName(),listener.getLastName(),listener.getNationality(),listener.getBirthYear());

    }

    @DeleteMapping("/deleteAdmin")
    public void adminDel(@RequestParam String userName){
        String sql = "DELETE FROM admin WHERE userName=?";
        jdbcTemplate.update(sql, userName);
    }

    @DeleteMapping("/deleteArtist")
    public void artistDel(@RequestParam String userName){
        String sql = "DELETE FROM artist WHERE userName=?";
        jdbcTemplate.update(sql, userName);
    }

    @DeleteMapping("/deleteListener")
    public void listenerDel(@RequestParam String userName){
        String sql = "DELETE FROM listener WHERE userName=?";
        jdbcTemplate.update(sql, userName);

    }
}
