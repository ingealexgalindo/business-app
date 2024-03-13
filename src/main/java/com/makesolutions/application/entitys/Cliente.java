package com.makesolutions.application.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Cliente", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "Nombre")
    private String nombre;

    @Size(max = 20)
    @Column(name = "NIT", length = 20)
    private String nit;

    @Size(max = 18)
    @Column(name = "DPI", length = 18)
    private String dpi;

    @Size(max = 20)
    @Column(name = "Telefono", length = 20)
    private String telefono;

    @Lob
    @Column(name = "Direccion")
    private String direccion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}