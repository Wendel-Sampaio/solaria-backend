package com.solaria.app.services;

import com.solaria.app.DTOs.GameDTO;
import com.solaria.app.DTOs.GameViewDTO;
import com.solaria.app.entities.Game;
import com.solaria.app.mappers.GameMapper;
import com.solaria.app.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameMapper gameMapper;

    public void postGame(GameDTO data) {
        Game newGame = gameMapper.toEntity(data);
        gameRepository.save(newGame);
    }

    public List<GameViewDTO> getAllGames() {
        List<Game> games = gameRepository.findAll();
        return gameMapper.toViewDtoList(games);
    }
}
