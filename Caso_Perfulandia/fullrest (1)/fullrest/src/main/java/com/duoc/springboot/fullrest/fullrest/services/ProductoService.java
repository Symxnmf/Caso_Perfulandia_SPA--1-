package com.duoc.springboot.fullrest.fullrest.services;
import java.util.List;
import java.util.Optional;
import com.duoc.springboot.fullrest.fullrest.entities.Producto;


public interface ProductoService {

    List<Producto> findByAll();

    Optional<Producto> findById(Long id);

    Producto save(Producto unProducto);

    Optional<Producto> delete(Producto unProducto);


}
