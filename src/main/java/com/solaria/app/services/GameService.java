package com.solaria.app.services;

import com.solaria.app.DTOs.GameDTO;
import com.solaria.app.entities.Game;
import com.solaria.app.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public void postGame(GameDTO data) {
        System.out.println(data);
        Game newGame = new Game(data.title(), data.description(), data.genre(), data.coverImage(), data.releaseDate(), data.creatorUserId());
        gameRepository.save(newGame);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
}
