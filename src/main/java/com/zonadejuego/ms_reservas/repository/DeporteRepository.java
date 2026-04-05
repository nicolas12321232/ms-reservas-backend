package com.zonadejuego.ms_reservas.repository;

import com.zonadejuego.ms_reservas.entity.Deporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeporteRepository extends JpaRepository<Deporte, Long> {
}