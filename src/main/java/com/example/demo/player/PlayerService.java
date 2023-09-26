package com.example.demo.player;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
// this acts as the Service Layer (Business Logic goes here)
@Service //tells us that this is a component for a spring bean (@ Component, but service is more specific in this use case)
public class PlayerService {

    public List<Player> getPlayers() {
        return List.of(
                new Player(
                        1L,
                        "Donovan Mitchell",
                        "Cleveland",
                        25,
                        24 )
        );
    }
}
