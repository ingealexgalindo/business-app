package com.makesolutions.application.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @Column(name = "ID_Venta", nullable = false)
    private Integer id;

    @Column(name = "Fecha")
    private LocalDate fecha;

    @Column(name = "Total", precision = 10, scale = 2)
    private BigDecimal total;

    @Column(name = "MontoEfectivo", precision = 10, scale = 2)
    private BigDecimal montoEfectivo;

    @Column(name = "MontoTarjeta", precision = 10, scale = 2)
    private BigDecimal montoTarjeta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getMontoEfectivo() {
        return montoEfectivo;
    }

    public void setMontoEfectivo(BigDecimal montoEfectivo) {
        this.montoEfectivo = montoEfectivo;
    }

    public BigDecimal getMontoTarjeta() {
        return montoTarjeta;
    }

    public void setMontoTarjeta(BigDecimal montoTarjeta) {
        this.montoTarjeta = montoTarjeta;
    }

}