package com.perfulandia.springboot.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.entities.Notificacion;
import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.repository.NotificacionRepository;
import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.services.NotificacionServiceImpl;




public class NotificacionServiceImplTest {

    @InjectMocks
    private NotificacionServiceImpl service;

    @Mock
    private NotificacionRepository repository;

    List<Notificacion> list = new ArrayList<Notificacion>();

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);

        this.chargeNotificacion();
    }

    @Test
    public void findByAllTest(){

        when(repository.findAll()).thenReturn(list);

        List<Notificacion> response = service.findByAll();

        assertEquals(2, response.size());

        verify(repository, times(1)).findAll();





    }


    public void chargeNotificacion(){

        Notificacion not1 = new Notificacion(Long.valueOf(1),"tipo","destinario","mensajess",780,"dsdsd");
        Notificacion not2 = new Notificacion(Long.valueOf(2),"tipo","destinario","mensajesss",323,"dsdsd");
       // Notificacion not3 = new Notificacion(Long.valueOf(3),"tipo","destinario","mensajessss","33/43/54",);

        list.add(not1);
        list.add(not2);
       // list.add(not3);
    }

}
