package agenda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.data.annotation.AutoPopulated;

import javax.persistence.*;
import java.util.List;

@Entity
public class Grupo {

    @Id
    @AutoPopulated
    private Integer id;

    private String descricao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "contact_group", joinColumns =
            {@JoinColumn(name = "group_id")}, inverseJoinColumns =
            {@JoinColumn(name = "contact_id")})
    private List<Contact> contactList;

    public Grupo(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Grupo(Integer id, String descricao, List<Contact> contactList) {
        this.id = id;
        this.descricao = descricao;
        this.contactList = contactList;
    }

    public Grupo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
