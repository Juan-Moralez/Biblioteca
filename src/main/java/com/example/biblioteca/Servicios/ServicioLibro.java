package com.example.biblioteca.Servicios;


import com.example.biblioteca.Entidades.Libro;
import com.example.biblioteca.Repositorios.IrepositorioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioLibro {
    @Autowired
    private IrepositorioLibro repositorioLibro;

    public Libro saveLibro(Libro libro) {
       return repositorioLibro.save(libro);
    }

    public Optional<Libro> getLibro(long id){
        return repositorioLibro.findById(id);
    }

    public List<Libro> getAllLibros(){
        return repositorioLibro.findAll();
    }



}
