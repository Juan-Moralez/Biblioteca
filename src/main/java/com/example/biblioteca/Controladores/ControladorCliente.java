package com.example.biblioteca.Controladores;

import com.example.biblioteca.Entidades.Cliente;
import com.example.biblioteca.Servicios.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Clientes")
public class ControladorCliente {
    @Autowired
    private ServicioCliente servicioCliente;

    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
            return servicioCliente.saveCliente(cliente);
    }

    @GetMapping({"/id"})
    public Optional<Cliente> getCliente(@PathVariable Long id){
        return servicioCliente.getCliente(id);
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return servicioCliente.getAllClientes();
    }




}
