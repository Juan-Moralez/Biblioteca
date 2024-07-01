package com.example.biblioteca.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int tiempoDeprestamo;
    private int fechaDelPrestamo;

    @ManyToOne
    @JoinColumn(name = "Cliente_ID")
    @JsonBackReference
    private Cliente cliente;

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

    public int getFechaDelPrestamo() {
        return fechaDelPrestamo;
    }

    public void setFechaDelPrestamo(int fechaDelPrestamo) {
        this.fechaDelPrestamo = fechaDelPrestamo;
    }

    public int getTiempoDeprestamo() {
        return tiempoDeprestamo;
    }

    public void setTiempoDeprestamo(int tiempoDeprestamo) {
        this.tiempoDeprestamo = tiempoDeprestamo;
    }
}
