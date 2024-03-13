package com.makesolutions.application.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "Nombre")
    private String nombre;

    @Lob
    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "PrecioCompra", precision = 10, scale = 2)
    private BigDecimal precioCompra;

    @Column(name = "PrecioVenta", precision = 10, scale = 2)
    private BigDecimal precioVenta;

    @Column(name = "CantidadInventario")
    private Integer cantidadInventario;

    @Column(name = "StockMinimo")
    private Integer stockMinimo;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(Integer cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    public Integer getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

}