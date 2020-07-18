package com.example.spotify.controllers;

import com.example.spotify.entities.Premium;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PremiumController {

    final JdbcTemplate jdbcTemplate;

    public PremiumController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostMapping("/buyPremium")
    public void buyPre( @RequestBody Premium premium){
        String sql = "INSERT INTO premium (timeDuration,buyDate,creditNum,expirationDate,listener) VALUES (?,?,?,?,?)";

        jdbcTemplate.update(sql, premium.getTimeDuration(),premium.getBuyDate(),premium.getCreditNum(),premium.getExpirationDate(),premium.getListener());

    }
}
