package com.duoc.springboot.fullrest.fullrest.entities;

import java.util.List;

public class Recomendacion {

    private Long idCliente;
    private List<String> productosSugeridos;

    public Recomendacion() {
    }

    public Recomendacion(Long idCliente, List<String> productosSugeridos) {
        this.idCliente = idCliente;
        this.productosSugeridos = productosSugeridos;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<String> getProductosSugeridos() {
        return productosSugeridos;
    }

    public void setProductosSugeridos(List<String> productosSugeridos) {
        this.productosSugeridos = productosSugeridos;
    }
}
