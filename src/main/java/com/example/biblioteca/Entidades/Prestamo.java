package com.example.biblioteca.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;


@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tiempoDeprestamo;
    private String fechaDelPrestamo;

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
