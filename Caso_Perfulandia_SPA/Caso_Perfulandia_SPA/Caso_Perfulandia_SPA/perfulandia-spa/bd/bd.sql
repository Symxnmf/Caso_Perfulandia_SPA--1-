CREATE DATABASE perfulandia;
USE perfulandia;
CREATE TABLE producto(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(1000) NOT NULL,
    precio INT NOT NULL,
    stock INT NOT NULL,
    descripcion VARCHAR(1000),
    categoria VARCHAR(500)
);

CREATE TABLE usuario(
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    correo VARCHAR(200) NOT NULL,
    celular VARCHAR(12)
);

CREATE TABLE notificacion(
	id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(100) NOT NULL,
    destinatario VARCHAR(100) NOT NULL,
    mensaje VARCHAR(100) NOT NULL,
    fecha_envio INT NOT NULL,
    estado VARCHAR(100) NOT NULL
);