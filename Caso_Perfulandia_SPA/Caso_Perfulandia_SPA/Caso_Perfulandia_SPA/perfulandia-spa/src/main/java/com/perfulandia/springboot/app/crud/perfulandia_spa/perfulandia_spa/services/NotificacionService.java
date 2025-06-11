package com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.services;
import java.util.List;
import java.util.Optional;

import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.entities.Notificacion;

public interface NotificacionService {
    List<Notificacion> findByAll();

    Optional<Notificacion> findById(Long id);

    Notificacion save(Notificacion unnNotificacion);

    void deleteById(Long id);   

}
