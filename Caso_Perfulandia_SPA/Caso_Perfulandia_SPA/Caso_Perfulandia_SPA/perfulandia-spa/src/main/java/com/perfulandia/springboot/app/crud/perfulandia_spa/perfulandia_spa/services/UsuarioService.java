package com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.services;

import java.util.List;
import java.util.Optional;

import com.perfulandia.springboot.app.crud.perfulandia_spa.perfulandia_spa.entities.Usuario;

public interface UsuarioService {
    List<Usuario> findByAll();

    Optional<Usuario> findById(Long id);

    Usuario save(Usuario unUsuario);

    Optional<Usuario> delete (Usuario unUsuario);
}
