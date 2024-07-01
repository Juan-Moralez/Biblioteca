package com.example.biblioteca.Servicios;

import com.example.biblioteca.Entidades.Cliente;
import com.example.biblioteca.Repositorios.IrepositorioCliente;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServicioCliente {


    @Autowired
    private IrepositorioCliente repositorioCliente;
    @Autowired
    private ServicioDireccion servicioDireccion;

    public Cliente saveCliente(Cliente cliente) {
      return  repositorioCliente.save(cliente);
    }

    public Optional<Cliente> getCliente(long id) {
        return repositorioCliente.findById(id);
    }

    public List<Cliente> getAllClientes() {
        return repositorioCliente.findAll();
    }

    @PostConstruct
    public void SubirDatosCliente() {
            Cliente cliente1 = new Cliente();
            cliente1.setNombre("Juan");
            cliente1.setApellido("Moralez");
            cliente1.setEdad(19);
            cliente1.setEmail("juan.moralez@gmail.com");
            cliente1.setTelefono("55555555");

            Cliente clienteGuardado = repositorioCliente.save(cliente1);
            servicioDireccion.subirDatosDireccion(clienteGuardado);
            repositorioCliente.save(clienteGuardado);
    }


}
