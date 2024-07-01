package com.example.biblioteca.Entidades;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String editorial;
    private int cantidadDePaginas;
    private int anodepublicacion;


    @OneToMany(mappedBy = "libro", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Prestamo> prestamo;



    public String getTitulo() {
        return titulo;
    }

    public int getAnodepublicacion() {
        return anodepublicacion;
    }

    public void setAnodepublicacion(int anodepublicacion) {
        this.anodepublicacion = anodepublicacion;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void addPrestamo(Prestamo prestamo) {
        this.prestamo.add(prestamo);
        prestamo.setLibro(this);
    }

    public void removePrestamo(Prestamo prestamo) {
        this.prestamo.remove(prestamo);
        prestamo.setLibro(null);
    }

}
