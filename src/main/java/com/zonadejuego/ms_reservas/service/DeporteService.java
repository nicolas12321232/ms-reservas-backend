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

   
    public List<Deporte> obtenerTodos() {
        return deporteRepository.findAll();
    }

    
    public Deporte guardarDeporte(Deporte deporte) {
        return deporteRepository.save(deporte);
    }

    
    public Deporte actualizarDeporte(Long id, Deporte deporte) {
        if (deporteRepository.existsById(id)) {
            deporte.setId(id); 
            return deporteRepository.save(deporte);
        }
        return null; 
    }

  
    public void eliminarDeporte(Long id) {
        deporteRepository.deleteById(id);
    }
}