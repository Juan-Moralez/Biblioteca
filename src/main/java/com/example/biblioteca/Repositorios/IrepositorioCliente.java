package com.example.biblioteca.Repositorios;

import com.example.biblioteca.Entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IrepositorioCliente extends JpaRepository<Cliente, Long> {

}
