package com.makesolutions.application.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductosLoteId implements Serializable {
    private static final long serialVersionUID = 2227452839429428305L;
    @NotNull
    @Column(name = "ID_Producto", nullable = false)
    private Integer idProducto;

    @NotNull
    @Column(name = "ID_Lote", nullable = false)
    private Integer idLote;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdLote() {
        return idLote;
    }

    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductosLoteId entity = (ProductosLoteId) o;
        return Objects.equals(this.idProducto, entity.idProducto) &&
                Objects.equals(this.idLote, entity.idLote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, idLote);
    }

}