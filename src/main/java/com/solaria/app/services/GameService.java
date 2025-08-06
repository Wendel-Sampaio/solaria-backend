package com.solaria.app.services;

import com.solaria.app.entities.Game;
import com.solaria.app.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public void postGame(Game game) {
        System.out.print(game);
        gameRepository.save(game);
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
}
