package controllers;

import Repositorio.CursoRepositorio;
import entidade.Curso;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

/**
 *
 * @author Thales
 */
@Named(value = "cursoController")
@ConversationScoped
public class CursoController extends controllers.ControllerGenerico<Curso> implements Serializable {



    public CursoController() {
        super("listagemCursos.xhtml", "editarCurso.xhtml");
        entidade = new Curso();
        filtro = new Curso();


    }

    @EJB
    private CursoRepositorio repositorio;

    @PostConstruct
    public void configurar() {
        setDao(repositorio);
  
    }
    
}
