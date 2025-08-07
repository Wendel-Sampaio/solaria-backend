CREATE TABLE games (
    id UUID PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    genre game_genre NOT NULL,
    cover_image VARCHAR(255),
    release_date DATE NOT NULL,
    creator_user_id UUID NOT NULL,
    updated_at TIMESTAMP WITH TIME ZONE
);