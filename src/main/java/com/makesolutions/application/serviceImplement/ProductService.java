package com.makesolutions.application.serviceImplement;

import com.makesolutions.application.entitys.Producto;
import com.makesolutions.application.repository.ProductsRepository;
import com.makesolutions.application.services.IProductsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductsService {
    private final ProductsRepository repository;

    public ProductService(ProductsRepository repository) {
        this.repository = repository;
    }


    @Override
    public Optional<Producto> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public Producto update(Producto entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Producto> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Producto> list(Pageable pageable, Specification<Producto> filter) {
        return repository.findAll(filter, pageable);
    }

    @Override
    public int count() {
        return (int) repository.count();
    }
}
