package com.example.biblioteca.Controladores;


import com.example.biblioteca.Entidades.Libro;
import com.example.biblioteca.Servicios.ServicioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Libros")
public class ControladorLibro {
    @Autowired
    private ServicioLibro servicioLibro;

    @PostMapping
    public Libro saveLibro(@RequestBody Libro libro) {
        return servicioLibro.saveLibro(libro);
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibro(Long id){
        return servicioLibro.getLibro(id);
    }

    @GetMapping
    public List<Libro> getAllLibros(){
        return servicioLibro.getAllLibros();
    }
}
