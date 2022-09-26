package com.notiplus.notiplus.controllers;

        import com.notiplus.notiplus.dao.NoticiaDao;
        import com.notiplus.notiplus.models.Noticia;
        import com.notiplus.notiplus.models.Usuario;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
public class NoticiaController {

    @Autowired
    private NoticiaDao noticiaDao;

    @RequestMapping(value = "api/noticias", method = RequestMethod.POST)
    public void Registrar(@RequestBody Noticia noticia) {
        noticiaDao.registrar(noticia);
    }

    @RequestMapping(value = "api/noticias", method = RequestMethod.GET)
    public List<Noticia> Listar() {
        return noticiaDao.getNoticias();
    }


    @RequestMapping(value = "api/noticiasDelete/{id}", method = RequestMethod.DELETE)
    public void Eliminar(@PathVariable int id) {
        noticiaDao.eliminar(id);
    }

    @RequestMapping(value = "api/noticias/{id}",method = RequestMethod.PUT)
    public void Editar(@RequestBody Noticia noticia,@PathVariable int id){
        noticiaDao.editar(noticia,id);
    }
}

