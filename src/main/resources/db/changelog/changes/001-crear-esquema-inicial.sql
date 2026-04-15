


CREATE TABLE deportes (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    activo BOOLEAN DEFAULT TRUE
);


CREATE TABLE canchas (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    deporte_id BIGINT NOT NULL,
    precio_por_hora DECIMAL(10,2) NOT NULL,
    hora_apertura TIME,
    hora_cierre TIME,
    estado VARCHAR(50) NOT NULL,
    CONSTRAINT fk_cancha_deporte FOREIGN KEY (deporte_id) REFERENCES deportes(id)
);


CREATE TABLE reservas (
    id BIGSERIAL PRIMARY KEY,
    cancha_id BIGINT NOT NULL,
    usuario_id VARCHAR(100), 
    fecha_reserva DATE NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_fin TIME NOT NULL,
    estado VARCHAR(50) NOT NULL,
    precio_total DECIMAL(10,2),
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_reserva_cancha FOREIGN KEY (cancha_id) REFERENCES canchas(id)
);