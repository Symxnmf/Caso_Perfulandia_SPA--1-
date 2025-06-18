package com.duoc.springboot.fullrest.fullrest.restcontrollers;

import com.duoc.springboot.fullrest.fullrest.entities.Recomendacion;
import com.duoc.springboot.fullrest.fullrest.services.RecomendacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recomendaciones")
public class RecomendacionRestController {

    @Autowired
    private RecomendacionService recomendacionService;

    @GetMapping("/{idCliente}")
    public Recomendacion obtener(@PathVariable Long idCliente) {
        return recomendacionService.obtenerRecomendaciones(idCliente);
    }
}
