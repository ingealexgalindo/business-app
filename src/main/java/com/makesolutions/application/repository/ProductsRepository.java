package com.makesolutions.application.repository;

import com.makesolutions.application.entitys.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductsRepository
        extends JpaRepository<Producto, Long>,
        JpaSpecificationExecutor<Producto> {
}
