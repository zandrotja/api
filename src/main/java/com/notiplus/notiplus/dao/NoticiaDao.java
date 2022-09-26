package com.notiplus.notiplus.dao;

import com.notiplus.notiplus.models.Noticia;

import java.util.List;

public interface NoticiaDao {
    List<Noticia> getNoticias();

    void registrar(Noticia noticia);

    void eliminar(int id);

    void editar(Noticia noticia, int id);
}
