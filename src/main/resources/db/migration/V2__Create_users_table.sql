-- V2__Create_users_table.sql
-- Cria a tabela principal de usuários.

CREATE TABLE users (
                       id UUID PRIMARY KEY,
                       first_name VARCHAR(15) NOT NULL,
                       last_name VARCHAR(15) NOT NULL,
                       username VARCHAR(20) NOT NULL UNIQUE,
                       email VARCHAR(255) NOT NULL UNIQUE,

    -- A senha será armazenada como um hash (ex: bcrypt), que pode ser longo.
    -- VARCHAR(255) é um tamanho seguro e padrão.
                       password VARCHAR(255) NOT NULL,

    -- TIMESTAMP WITH TIME ZONE é o tipo recomendado para datas no PostgreSQL.
                       created_at TIMESTAMP WITH TIME ZONE NOT NULL,

    -- Usa o tipo ENUM criado na V1 para a coluna de role.
                       role user_role NOT NULL,

                       ban BOOLEAN NOT NULL DEFAULT FALSE
);