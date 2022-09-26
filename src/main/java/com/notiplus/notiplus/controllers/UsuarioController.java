package com.notiplus.notiplus.controllers;

import com.notiplus.notiplus.dao.UsuarioDao;
import com.notiplus.notiplus.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios",method = RequestMethod.POST)
    public void Registrar(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuarios",method = RequestMethod.GET)
    public List<Usuario> Listar(){
        return usuarioDao.getUsuarios();
    }


    @RequestMapping(value = "api/usuariosDelete/{id}",method = RequestMethod.DELETE )
    public void Eliminar(@PathVariable int id) {
        usuarioDao.eliminar(id);

    }

    @RequestMapping(value = "api/usuarios/{id}",method = RequestMethod.PUT)
    public void Editar(@RequestBody Usuario usuario,@PathVariable int id){
        usuarioDao.editar(usuario,id);
    }
}
