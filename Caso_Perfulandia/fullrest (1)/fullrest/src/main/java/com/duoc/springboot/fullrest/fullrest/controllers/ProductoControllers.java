package com.duoc.springboot.fullrest.fullrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.duoc.springboot.fullrest.fullrest.entities.Producto;
import com.duoc.springboot.fullrest.fullrest.repositories.ProductoRepositories;

@Controller
public class ProductoControllers {

    @Autowired
    private ProductoRepositories productorepositories;


    @GetMapping("/productos")
    public String verProductos(Model model){
        List<Producto> productitos= (List<Producto>) productorepositories.findAll();
        model.addAttribute("productitos", productitos);
        return "productos";

    }


}

