package com.example.biblioteca.Entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "cliente")
    @JsonManagedReference
    private Direccion  direccion;


     @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
     @JsonManagedReference
     private List<Prestamo> prestamo;

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

     public void addPrestamo(Prestamo prestamo) {
       this.prestamo.add(prestamo);
      prestamo.setCliente(this);
      }

    public void removePrestamo(Prestamo prestamo) {
        this.prestamo.remove(prestamo);
           prestamo.setCliente(null);
     }


}
