package com.example.biblioteca.Controladores;

import com.example.biblioteca.Entidades.Direccion;
import com.example.biblioteca.Servicios.ServicioDireccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Direccion")
public class ControladorDireccion {
    @Autowired
    private ServicioDireccion servicioDireccion;

    @PostMapping
    public Direccion saveDireccion(Direccion direccion) {
        return servicioDireccion.saveDireccion(direccion);
    }

    @GetMapping("/{id}")
    public Optional<Direccion> getDireccion(Long id) {
        return servicioDireccion.getDireccion(id);
    }

    @GetMapping
    public List<Direccion> getAllDireccion(){
        return servicioDireccion.getAllDirecciones();
    }

}
