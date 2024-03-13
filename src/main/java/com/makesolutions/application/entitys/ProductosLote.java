package com.makesolutions.application.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "productos_lotes")
public class ProductosLote {
    @EmbeddedId
    private ProductosLoteId id;

    @MapsId("idProducto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Producto", nullable = false)
    private Producto idProducto;

    @MapsId("idLote")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_Lote", nullable = false, referencedColumnName = "ID_Lote")
    private Lote idLote;

    public ProductosLoteId getId() {
        return id;
    }

    public void setId(ProductosLoteId id) {
        this.id = id;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Lote getIdLote() {
        return idLote;
    }

    public void setIdLote(Lote idLote) {
        this.idLote = idLote;
    }

}