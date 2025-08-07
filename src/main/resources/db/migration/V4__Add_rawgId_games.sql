ALTER TABLE game
ADD COLUMN rawg_id BIGINT;
CREATE UNIQUE INDEX idx_game_rawg_id ON game (rawg_id);