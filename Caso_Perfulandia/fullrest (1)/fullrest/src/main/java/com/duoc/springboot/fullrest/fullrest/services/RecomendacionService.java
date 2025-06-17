package com.duoc.springboot.fullrest.fullrest.services;

import com.duoc.springboot.fullrest.fullrest.entities.Recomendacion;

public interface RecomendacionService {
    Recomendacion obtenerRecomendaciones(Long idCliente);
}
