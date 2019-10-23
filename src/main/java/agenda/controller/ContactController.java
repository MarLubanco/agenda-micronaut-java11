package agenda.controller;

import agenda.model.Contact;
import agenda.service.ContactService;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;
import java.util.List;

@Controller("/api/contacts")
public class ContactController {

    @Inject
    private ContactService contactService;

    @Post
    public void saveContact(@Body Contact contact) {
        contactService.saveContact(contact);
    }

    @Get("/recupera-contatos")
    public List<Contact> findAllContacts() {
        return contactService.findAllContacts();
    }

    @Get("/recupera-contato/{nome}")
    public Contact findContactByNome(@PathVariable String nome) throws Exception {
        return contactService.findContactByName(nome);
    }
}
