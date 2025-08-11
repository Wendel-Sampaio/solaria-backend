package com.solaria.app.controllers;

import com.solaria.app.dtos.GameDTO;
import com.solaria.app.dtos.GameViewDTO;
import com.solaria.app.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping
    public ResponseEntity<GameDTO> postGame(@RequestBody GameDTO data) {
        gameService.postGame(data);
        return ResponseEntity.ok(data);
    }

    @GetMapping
    public ResponseEntity<List<GameViewDTO>> getAllGames() {
        List<GameViewDTO> games = gameService.getAllGames();
        return ResponseEntity.ok(games);
    }
}
