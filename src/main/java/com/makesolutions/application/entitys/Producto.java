package com.makesolutions.application.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "Nombre")
    private String nombre;

    @Lob
    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Precio_compra", precision = 10, scale = 2)
    private BigDecimal precioCompra;

    @Column(name = "Precio_venta", precision = 10, scale = 2)
    private BigDecimal precioVenta;

    @Column(name = "Stock_minimo")
    private Integer stockMinimo;

}