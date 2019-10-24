package agenda.controller;

import agenda.model.Grupo;
import agenda.service.GrupoService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.List;

@Controller("api/grupos")
public class GrupoController {

    @Inject
    private GrupoService grupoService;

    @Post
    public Grupo saveGrupo(@Body Grupo grupo) {
        return grupoService.saveGrupo(grupo);
    }

    @Get
    public List<Grupo> findAllGrupos() {
        return grupoService.findAll();
    }
}
