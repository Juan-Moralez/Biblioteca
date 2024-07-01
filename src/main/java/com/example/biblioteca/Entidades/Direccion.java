package com.example.biblioteca.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String calle;
    private String ciudad;
    private String provincia;
    private int codigoPostal;
    private int numeroDeLaVivienda;


    @OneToOne
    @JoinColumn(name = "cliente_id")
    @JsonBackReference
    private Cliente cliente;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroDeLaVivienda() {
        return numeroDeLaVivienda;
    }

    public void setNumeroDeLaVivienda(int numeroDeLaVivienda) {
        this.numeroDeLaVivienda = numeroDeLaVivienda;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
