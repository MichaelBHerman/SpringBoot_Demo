package com.example.demo.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player") //this annotation maps HTTP requests to handler methods of MVC and REST controllers.  it can be used at the class or method level.
public class PlayerController {

    private final PlayerService playerService; //we create an instance of our service layer

    //constructor with playerService object created
    @Autowired //automatically creates or instantiates this class as a spring bean
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    //This is known as an HTTP "handler" method
    @GetMapping
    public List<Player> getPlayers() {
        return playerService.getPlayers(); //now we call the getPlayers method through the playerService object
    }
}
