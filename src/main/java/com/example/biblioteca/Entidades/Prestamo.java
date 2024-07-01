package com.example.biblioteca.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tiempoDeprestamo;
    private String fechaDelPrestamo;

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @ManyToOne
    @JoinColumn(name = "Cliente_ID")
    @JsonBackReference
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "Libro_ID")
    @JsonManagedReference
    private Libro libro;

    public Prestamo() {

    }

    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFechaDelPrestamo() {
        return fechaDelPrestamo;
    }

    public void setFechaDelPrestamo(String fechaDelPrestamo) {
        this.fechaDelPrestamo = fechaDelPrestamo;
    }

    public String getTiempoDeprestamo() {
        return tiempoDeprestamo;
    }

    public void setTiempoDeprestamo(String tiempoDeprestamo) {
        this.tiempoDeprestamo = tiempoDeprestamo;
    }
}
