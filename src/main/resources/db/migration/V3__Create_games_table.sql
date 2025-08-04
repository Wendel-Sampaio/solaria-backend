-- V3__Create_games_table.sql
-- Cria a tabela de jogos com relacionamento para a tabela de usuários.

CREATE TABLE games (
                      id UUID PRIMARY KEY,
                      title VARCHAR(100) NOT NULL,
                      description VARCHAR(1000) NOT NULL,

    -- Usa o tipo ENUM criado na V1 para a coluna de gênero.
                      genre game_genre NOT NULL,

                      cover_image VARCHAR(255),

    -- LocalDate em Java é mapeado para DATE em SQL.
                      release_date DATE NOT NULL,

                      creator_user_id UUID NOT NULL,

    -- LocalDateTime é mapeado para TIMESTAMP.
                      updated_at TIMESTAMP WITH TIME ZONE,

    -- Define a constraint de chave estrangeira para garantir que o criador do jogo existe.
                      CONSTRAINT fk_game_creator_user
                          FOREIGN KEY(creator_user_id)
                              REFERENCES users(id)
);