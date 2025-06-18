package com.duoc.springboot.fullrest.fullrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.duoc.springboot.fullrest.fullrest.entities.Producto;
import com.duoc.springboot.fullrest.fullrest.repositories.ProductoRepositories;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepositories productorepositories;


    @Override
    @Transactional
    public Optional<Producto> delete(Producto unProducto) {
        Optional<Producto> productoOptional = productorepositories.findById(unProducto.getId());
        productoOptional.ifPresent(productoDb ->{ 
            productorepositories.delete(unProducto);
        });
        return productoOptional;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findByAll() {
        return (List<Producto>) productorepositories.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Producto> findById(Long id) {
       return productorepositories.findById(id);
    }

    @Override
    @Transactional
    public Producto save(Producto unProducto) {
        return productorepositories.save(unProducto);
    }

    

}
