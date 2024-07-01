package com.example.biblioteca.Servicios;

import com.example.biblioteca.Entidades.Cliente;
import com.example.biblioteca.Entidades.Libro;
import com.example.biblioteca.Entidades.Prestamo;
import com.example.biblioteca.Repositorios.IrepositorioPrestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioPrestamo {
    @Autowired
    private IrepositorioPrestamo repositorioPrestamo;

    public Prestamo savePrestamo(Prestamo prestamo) {
        return repositorioPrestamo.save(prestamo);
    }

    public Optional<Prestamo> getPrestamo(long id) {
        return repositorioPrestamo.findById(id);
    }

    public List<Prestamo> getAllPrestamos(){
        return repositorioPrestamo.findAll();
    }

    public void subirDatosPrestamo(Cliente cliente, Libro libro){
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setFechaDelPrestamo("15/07/2024");
        prestamo1.setTiempoDeprestamo("30 Dias");
        prestamo1.setCliente(cliente);
        prestamo1.setLibro(libro);

        repositorioPrestamo.save(prestamo1);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setFechaDelPrestamo("19/07/2024");
        prestamo2.setTiempoDeprestamo("15 Dias");
        prestamo2.setCliente(cliente);
        prestamo2.setLibro(libro);
        repositorioPrestamo.save(prestamo2);
    }

}
