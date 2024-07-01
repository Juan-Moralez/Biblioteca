package com.example.biblioteca.Repositorios;

import com.example.biblioteca.Entidades.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrepositorioPrestamo extends JpaRepository<Prestamo, Long> {
}
