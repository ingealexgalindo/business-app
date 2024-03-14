package com.makesolutions.application.services;

import com.makesolutions.application.entitys.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.Optional;

public interface IProductsService {

    public Optional<Producto> get(Long id);
    public Producto update(Producto entity);
    public void delete(Long id);
    public Page<Producto> list(Pageable pageable);
    public Page<Producto> list(Pageable pageable, Specification<Producto> filter);

    public int count();


}
