package agenda.repository;

import agenda.model.Grupo;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface GrupoRepository extends CrudRepository<Grupo, Integer> {
}
