package agenda.repository;

import agenda.model.Contact;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

    Optional<Contact> findByNome(String nome);
}
