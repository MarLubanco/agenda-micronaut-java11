package agenda.service;

import agenda.model.Grupo;
import agenda.repository.GrupoRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class GrupoService {

    @Inject
    private GrupoRepository grupoRepository;

    public Grupo saveGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public List<Grupo> findAll() {
        return (List<Grupo>) grupoRepository.findAll();
    }
}
