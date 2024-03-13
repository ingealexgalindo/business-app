package com.makesolutions.application.entitys;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Detalles_Ventas")
public class DetallesVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Detalle_Venta", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Venta", referencedColumnName = "ID_Venta")
    private Venta idVenta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Producto", referencedColumnName = "ID_Producto")
    private Producto idProducto;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "PrecioUnitario", precision = 10, scale = 2)
    private BigDecimal precioUnitario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Venta getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

}