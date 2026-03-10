
# Fórum Hub API

## Tecnologias
- Java 17
- Spring Boot
- Spring Security
- JWT
- MySQL
- Flyway
- Maven

## Funcionalidades
- Criar tópicos
- Listar tópicos
- Buscar tópico por ID
- Deletar tópico

## Endpoints

POST /topicos  
GET /topicos  
GET /topicos/{id}  
DELETE /topicos/{id}

## Banco de dados

CREATE DATABASE forumhub;

Configurar application.properties.

## Executar

mvn spring-boot:run
