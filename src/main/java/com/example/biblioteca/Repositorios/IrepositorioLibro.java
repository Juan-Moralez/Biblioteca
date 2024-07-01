package com.example.biblioteca.Repositorios;

import com.example.biblioteca.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrepositorioLibro extends JpaRepository<Libro, Long> {
}
