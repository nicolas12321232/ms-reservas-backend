package com.zonadejuego.ms_reservas.service;

import com.zonadejuego.ms_reservas.entity.Reserva;
import com.zonadejuego.ms_reservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> obtenerTodas() {
        return reservaRepository.findAll();
    }

    public Reserva guardarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Reserva actualizarReserva(Long id, Reserva reserva) {
        if (reservaRepository.existsById(id)) {
            reserva.setId(id);
            return reservaRepository.save(reserva);
        }
        return null;
    }

    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}