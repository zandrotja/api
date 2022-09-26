package com.notiplus.notiplus.dao;

import com.notiplus.notiplus.models.Noticia;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional

public class NoticiaDaoImp implements NoticiaDao {

    @PersistenceContext
    EntityManager entityManager;

    //Metodo Listar Todas las Noticias
    @Override
    public List<Noticia> getNoticias() {
        String query= "FROM Noticia";
        List<Noticia> resultado=  entityManager.createQuery(query).getResultList();
        return resultado;
    }

    //Metodo Agregar Nueva Noticia
    @Override
    public void registrar(Noticia noticia) {
        entityManager.merge(noticia);
    }

    //Metodo Eliminar Noticia
    @Override
    public void eliminar(int id) {
        Noticia noticia = entityManager.find(Noticia.class, id);
        entityManager.remove(noticia);
    }

    //Metodo editar Noticia
    @Override
    public void editar(Noticia noticia, int id) {

        Noticia noti = entityManager.find(Noticia.class, id);

        noti.setTitulo(noticia.getTitulo());
        noti.setFecha(noticia.getFecha());
        noti.setImagen(noticia.getImagen());
        noti.setDescripcion(noticia.getDescripcion());
        noti.setCategoria(noticia.getCategoria());

        entityManager.merge(noti);

    }
}
