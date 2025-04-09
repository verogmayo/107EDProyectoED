-- Script SQL: Crear base de datos, tabla y usuario
CREATE DATABASE ejemplo_db;
USE ejemplo_db;

CREATE TABLE personas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    edad INT
);

CREATE USER 'usuario_test'@'localhost' IDENTIFIED BY 'contrasena123';
GRANT ALL PRIVILEGES ON ejemplo_db.* TO 'usuario_test'@'localhost';
FLUSH PRIVILEGES;
