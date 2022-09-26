package com.notiplus.notiplus.dao;

import com.notiplus.notiplus.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(int id);

    void registrar(Usuario usuario);

    void editar(Usuario usuario, int id);
}

