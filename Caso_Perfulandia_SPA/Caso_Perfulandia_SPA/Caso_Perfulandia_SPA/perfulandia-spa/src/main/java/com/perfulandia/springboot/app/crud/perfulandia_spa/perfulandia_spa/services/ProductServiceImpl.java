package com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.entities.Producto;
import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.repository.ProductoRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findByAll() {
        return (List<Producto>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Producto> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Producto save(Producto unProducto) {
        return repository.save(unProducto);
    }

    @Override
    @Transactional
    public Optional<Producto> delete(Producto unProducto) {
        Optional<Producto> productoOptional = repository.findById(unProducto.getId());
        productoOptional.ifPresent(productoDb->{
            repository.delete(unProducto);
        });
        return productoOptional;
    }

}
