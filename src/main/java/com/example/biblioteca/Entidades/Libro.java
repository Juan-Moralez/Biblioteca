package com.example.biblioteca.Entidades;


import jakarta.persistence.*;


@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String autor;
    private String editorial;
    private int cantidadDePaginas;
    private int anodepublicacion;




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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
}
