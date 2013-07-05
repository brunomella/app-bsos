package br.com.bsos.app.modelo;

import br.com.bsos.app.modelo.util.AbstractEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario extends AbstractEntity implements Serializable {

    @Column(name = "nome", length = 100)
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
