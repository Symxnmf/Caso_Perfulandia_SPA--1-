package com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.entities.Notificacion;
import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.repository.NotificacionRepository;
@Service
public class NotificacionServiceImpl implements NotificacionService{


    @Autowired
    private NotificacionRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Notificacion> findByAll() {
        return (List<Notificacion>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Notificacion> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Notificacion save(Notificacion unnNotificacion) {
        return repository.save(unnNotificacion);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id); 
    }
 }


  


    


