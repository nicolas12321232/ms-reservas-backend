package com.zonadejuego.ms_reservas.service;

import com.zonadejuego.ms_reservas.entity.Cancha;
import com.zonadejuego.ms_reservas.repository.CanchaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanchaService {

    @Autowired
    private CanchaRepository canchaRepository;

    public List<Cancha> obtenerTodas() {
        return canchaRepository.findAll();
    }

    public Cancha guardarCancha(Cancha cancha) {
        return canchaRepository.save(cancha);
    }

    public Cancha actualizarCancha(Long id, Cancha cancha) {
        if (canchaRepository.existsById(id)) {
            cancha.setId(id);
            return canchaRepository.save(cancha);
        }
        return null;
    }

    public void eliminarCancha(Long id) {
        canchaRepository.deleteById(id);
    }
}