package com.example.spotify.controllers;

import com.example.spotify.entities.Admin;
import com.example.spotify.entities.Artist;
import com.example.spotify.entities.Listener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticateController {

    final JdbcTemplate jdbcTemplate;

    public AuthenticateController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/adminRegister")
    public void adminReg(@RequestParam String token, @RequestBody Admin admin){

    }

    @PostMapping("/artistRegister")
    public void artistReg(@RequestParam String token, @RequestBody Artist artist){

    }

    @PostMapping("/listenerRegister")
    public void listenerReg(@RequestParam String token, @RequestBody Listener listener){

    }

    @DeleteMapping("/deleteAdmin")
    public void adminDel(@RequestParam String token, @RequestBody Admin admin){

    }

    @DeleteMapping("/deleteArtist")
    public void artistDel(@RequestParam String token, @RequestBody Artist artist){

    }

    @DeleteMapping("/deleteListener")
    public void listenerDel(@RequestParam String token, @RequestBody Listener listener){

    }
}
