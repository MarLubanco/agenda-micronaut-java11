package agenda.service;

import agenda.model.Contact;
import agenda.repository.ContactRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class ContactService {

    @Inject
    private ContactRepository contactRepository;

    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    public Contact findContactByName(String nome) throws Exception {
        Contact contatoRecuperado = contactRepository.findByNome(nome)
                .orElseThrow(() -> new Exception("Não foi possivel encontrar o contato"));
        return contatoRecuperado;
    }

    public List<Contact> findAllContacts() {
        return (List<Contact>) contactRepository.findAll();
    }
}
