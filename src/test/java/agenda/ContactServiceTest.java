package agenda;

import agenda.model.Contact;
import agenda.service.ContactService;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class ContactServiceTest {

    @Inject
    private ContactService contactService;

    @Test
    private void saveContact_deveSalvarNovoContato() throws Exception {
        Contact contact = new Contact(1,"Thome", "Francisconi");
        contactService.saveContact(contact);
        Contact contatoRecuperado = contactService.findContactByName(contact.getNome());
        Assertions.assertEquals(contact.getNome(), contatoRecuperado.getNome());
    }
}
