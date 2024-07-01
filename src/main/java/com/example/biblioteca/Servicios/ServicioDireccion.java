package com.example.biblioteca.Servicios;


import com.example.biblioteca.Entidades.Cliente;
import com.example.biblioteca.Entidades.Direccion;
import com.example.biblioteca.Repositorios.IrepositorioDireccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioDireccion {
    @Autowired
    private IrepositorioDireccion repositorioDireccion;

    public Direccion saveDireccion(Direccion direccion) {
        return repositorioDireccion.save(direccion);
    }

    public Optional<Direccion> getDireccion(long id) {
        return repositorioDireccion.findById(id);
    }

    public List<Direccion> getAllDirecciones() {
        return repositorioDireccion.findAll();
    }

    public void subirDatosDireccion(Cliente cliente){
        Direccion direccion1 = new Direccion();
        direccion1.setCalle("calle");
        direccion1.setCiudad("ciudad");
        direccion1.setProvincia("provincia");
        direccion1.setCodigoPostal(1231);
        direccion1.setNumeroDeLaVivienda(123);
        direccion1.setCliente(cliente);

        repositorioDireccion.save(direccion1);

    }

}
