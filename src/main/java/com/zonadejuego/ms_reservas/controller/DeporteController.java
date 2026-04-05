package com.zonadejuego.ms_reservas.controller;

import com.zonadejuego.ms_reservas.entity.Deporte;
import com.zonadejuego.ms_reservas.service.DeporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/deportes") // Esta será la URL base
public class DeporteController {

    @Autowired
    private DeporteService deporteService;

    // Endpoint para ver los deportes: GET http://localhost:9002/api/deportes
    @GetMapping
    public List<Deporte> listarDeportes() {
        return deporteService.obtenerTodos();
    }

    // Endpoint para crear un deporte: POST http://localhost:9002/api/deportes
    @PostMapping
    public Deporte crearDeporte(@RequestBody Deporte deporte) {
        return deporteService.guardarDeporte(deporte);
    }

    @PutMapping("/{id}")
    public Deporte actualizarDeporte(@PathVariable Long id, @RequestBody Deporte deporte) {
        return deporteService.actualizarDeporte(id, deporte);
    }

    @DeleteMapping("/{id}")
    public void eliminarDeporte(@PathVariable Long id) {
        deporteService.eliminarDeporte(id);
    }
}