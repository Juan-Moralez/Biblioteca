package com.example.biblioteca.Servicios;

import com.example.biblioteca.Entidades.Prestamo;
import com.example.biblioteca.Repositorios.IrepositorioPrestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioPrestamo {
    @Autowired
    private IrepositorioPrestamo servicioPrestamo;

    public Prestamo savePrestamo(Prestamo prestamo) {
        return servicioPrestamo.save(prestamo);
    }

    public Optional<Prestamo> getPrestamo(long id) {
        return servicioPrestamo.findById(id);
    }

    public List<Prestamo> getAllPrestamos(){
        return servicioPrestamo.findAll();
    }
}
