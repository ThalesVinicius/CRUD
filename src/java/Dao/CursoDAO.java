package Dao;

import Repositorio.CursoRepositorio;
import entidade.Curso;
import java.util.List;
import javax.ejb.Singleton;

@Singleton
public class CursoDAO extends DAOGenerico<Curso> implements CursoRepositorio {

    public CursoDAO() {
        super(Curso.class);
    }

    @Override
    public List<Curso> Buscar(Curso filtro) {

        return Like("nome", filtro.getNome())
                .IgualA("sigla", filtro.getSigla())
                .IgualA("id", filtro.getId())
                .OrderBy("nome", "ASC")
               
                .Buscar();
    }

}
