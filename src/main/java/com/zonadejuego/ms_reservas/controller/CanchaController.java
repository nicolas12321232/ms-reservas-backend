package com.zonadejuego.ms_reservas.controller;

import com.zonadejuego.ms_reservas.entity.Cancha;
import com.zonadejuego.ms_reservas.service.CanchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/canchas")
public class CanchaController {

    @Autowired
    private CanchaService canchaService;

    @GetMapping
    public List<Cancha> listarCanchas() {
        return canchaService.obtenerTodas();
    }

    @PostMapping
    public Cancha crearCancha(@RequestBody Cancha cancha) {
        return canchaService.guardarCancha(cancha);
    }

    @PutMapping("/{id}")
    public Cancha actualizarCancha(@PathVariable Long id, @RequestBody Cancha cancha) {
        return canchaService.actualizarCancha(id, cancha);
    }

    @DeleteMapping("/{id}")
    public void eliminarCancha(@PathVariable Long id) {
        canchaService.eliminarCancha(id);
    }
}