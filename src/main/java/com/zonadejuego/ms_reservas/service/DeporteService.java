package com.zonadejuego.ms_reservas.service;

import com.zonadejuego.ms_reservas.entity.Deporte;
import com.zonadejuego.ms_reservas.repository.DeporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeporteService {

    @Autowired
    private DeporteRepository deporteRepository;

    // Método para listar todos los deportes
    public List<Deporte> obtenerTodos() {
        return deporteRepository.findAll();
    }

    // Método para guardar un nuevo deporte
    public Deporte guardarDeporte(Deporte deporte) {
        return deporteRepository.save(deporte);
    }

    // Método para actualizar
    public Deporte actualizarDeporte(Long id, Deporte deporte) {
        if (deporteRepository.existsById(id)) {
            deporte.setId(id); // Aseguramos que se actualice el registro correcto
            return deporteRepository.save(deporte);
        }
        return null; // Si no existe, no hace nada
    }

    // Método para eliminar
    public void eliminarDeporte(Long id) {
        deporteRepository.deleteById(id);
    }
}