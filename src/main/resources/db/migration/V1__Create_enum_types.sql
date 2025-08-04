-- V1__Create_enum_types.sql
-- Cria os tipos ENUM para serem usados nas tabelas, garantindo consistência e performance.

CREATE TYPE user_role AS ENUM ('ADMIN', 'USER');

CREATE TYPE game_genre AS ENUM ('ADVENTURE', 'ACTION');