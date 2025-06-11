package com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.services;

import java.util.List;
import java.util.Optional;

import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.entities.Producto;

public interface ProductService {

    List<Producto> findByAll();

    Optional<Producto> findById(Long id);

    Producto save(Producto unProducto);

    Optional<Producto> delete (Producto unProducto);

}
