package com.notiplus.notiplus.dao;

import com.notiplus.notiplus.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    //Metodo Listar Todos los Usuarios
    @Override
    public List<Usuario> getUsuarios() {
        String query= "FROM Usuario";

        List<Usuario> resultado=  entityManager.createQuery(query).getResultList();
        return resultado;

    }

    //Metodo Eliminar Usuario
    @Override
    public void eliminar(int id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);

    }

    //Metodo Agregar Nuevo Usuario
    @Override
    public void registrar(Usuario usuario) {
       entityManager.merge(usuario);

    }

    //Metodo Editar Usuario
    @Override
    public void editar(Usuario usuario, int id) {

        Usuario user = entityManager.find(Usuario.class, id);
        user.setNombre(usuario.getNombre());
        user.setApellido(usuario.getApellido());
        user.setTelefono(usuario.getTelefono());
        user.setEmail(usuario.getEmail());
        user.setUser(usuario.getUser());
        user.setPassword(usuario.getPassword());

        entityManager.merge(user);

    }

}
