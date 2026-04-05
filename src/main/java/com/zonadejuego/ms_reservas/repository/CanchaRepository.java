package com.zonadejuego.ms_reservas.repository;

import com.zonadejuego.ms_reservas.entity.Cancha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanchaRepository extends JpaRepository<Cancha, Long> {
}