package com.example.biblioteca.Controladores;

import com.example.biblioteca.Entidades.Prestamo;
import com.example.biblioteca.Servicios.ServicioPrestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Prestamos")
public class ControladorPrestamo {
    @Autowired
    private ServicioPrestamo servicioPrestamo;

    @PostMapping
    public Prestamo savePrestamo(Prestamo prestamo){
        return servicioPrestamo.savePrestamo(prestamo);
    }

    @GetMapping("/{id}")
    public Optional<Prestamo> getPrestamo(Long id){
        return servicioPrestamo.getPrestamo(id);
    }

    @GetMapping
    public List<Prestamo> getAllPrestamo(){
        return servicioPrestamo.getAllPrestamos();
    }

}
