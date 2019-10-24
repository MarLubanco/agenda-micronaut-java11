package agenda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.data.annotation.AutoPopulated;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contact {

    @Id
    @AutoPopulated
    private Integer id;

    private String nome;

    private String sobrenome;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "contactList")
    @JsonIgnore
    private List<Grupo> groupos;

    public Contact(Integer id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Contact() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<Grupo> getGroupos() {
        return groupos;
    }

    public void setGroupos(List<Grupo> groupos) {
        this.groupos = groupos;
    }
}
