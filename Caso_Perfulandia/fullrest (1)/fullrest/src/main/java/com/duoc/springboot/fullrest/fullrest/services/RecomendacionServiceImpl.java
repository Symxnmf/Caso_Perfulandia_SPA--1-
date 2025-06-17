package com.duoc.springboot.fullrest.fullrest.services;

import com.duoc.springboot.fullrest.fullrest.entities.Recomendacion;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RecomendacionServiceImpl implements RecomendacionService {

    @Override
    public Recomendacion obtenerRecomendaciones(Long idCliente) {
        // Recomendaciones simuladas
        return new Recomendacion(idCliente, Arrays.asList(
            "Perfume Hombre Fresh",
            "Set Regalo Fragancia Suave",
            "Aromatizante de Ambiente Citrus"
        ));
    }
}
