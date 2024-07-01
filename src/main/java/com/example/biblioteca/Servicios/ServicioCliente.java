package com.example.biblioteca.Servicios;

import com.example.biblioteca.Entidades.Cliente;
import com.example.biblioteca.Entidades.Libro;
import com.example.biblioteca.Repositorios.IrepositorioCliente;
import com.example.biblioteca.Repositorios.IrepositorioLibro;
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

    @Autowired
    private ServicioPrestamo servicioPrestamo;
    @Autowired
    private ServicioLibro servicioLibro;
    @Autowired
    private IrepositorioLibro repositorioLibro;

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
        try{
            Cliente cliente1 = new Cliente();
            cliente1.setNombre("Juan");
            cliente1.setApellido("Moralez");
            cliente1.setEdad(19);
            cliente1.setEmail("juan.moralez@gmail.com");
            cliente1.setTelefono("55555555");

            Cliente cliente2 = new Cliente();
            cliente2.setNombre("Julian");
            cliente2.setApellido("Moralez");
            cliente2.setEdad(12);
            cliente2.setEmail("julian.moralez@gmail.com");
            cliente2.setTelefono("55555553");



            Cliente cliente1g = repositorioCliente.save(cliente1);
            Cliente cliente2g = repositorioCliente.save(cliente2);

            Libro libro1 = new Libro();
            libro1.setTitulo("El señor de los anillos");
            libro1.setAnodepublicacion(1954);
            libro1.setEditorial("ivrea");
            libro1.setCantidadDePaginas(1392);
            repositorioLibro.save(libro1);

            Libro libro2 = new Libro();
            libro2.setTitulo("El silmarillion ");
            libro2.setAnodepublicacion(1977);
            libro2.setEditorial("Booket");
            libro2.setCantidadDePaginas(448);

            repositorioLibro.save(libro2);

            servicioPrestamo.subirDatosPrestamo(cliente1g,libro1);
            servicioPrestamo.subirDatosPrestamo(cliente2g,libro2);
            servicioDireccion.subirDatosDireccion(cliente1g);
            repositorioCliente.save(cliente1g);
    }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error al subir datos");
        }


    }


}
