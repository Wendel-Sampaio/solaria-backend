package com.solaria.app.mappers;

import com.solaria.app.dtos.GameDTO;
import com.solaria.app.dtos.GameViewDTO;
import com.solaria.app.entities.Game;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GameMapper {

    Game toEntity(GameDTO gameDTO);
    GameViewDTO toViewDto(Game game);
    List<GameViewDTO> toViewDtoList(List<Game> games);
}
