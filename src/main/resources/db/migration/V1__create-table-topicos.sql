
CREATE TABLE topicos (
 id BIGINT AUTO_INCREMENT PRIMARY KEY,
 titulo VARCHAR(255),
 mensagem TEXT,
 data_criacao DATETIME,
 autor VARCHAR(100),
 curso VARCHAR(100),
 status VARCHAR(50)
);
