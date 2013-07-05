package br.com.bsos.app.modelo;

import br.com.bsos.app.modelo.util.AbstractEntity;
import br.com.bsos.app.modelo.util.TipoPerfil;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Table;



/**
 *
 * @author BrunoLuiz
 */
@Entity
@Table(name = "usuario")
public class Usuario extends AbstractEntity implements Serializable {

//    @NotNull
    @Column(name = "nome", length = 150)
    private String nome;
//    @Email
//    @NotNull
//    @NotEmpty
    @Column(name = "email", length = 150)
    private String email;
//    @NotNull
//    @NotEmpty
    @Column(name = "senha", length = 50)
    private String senha;
    @Enumerated(EnumType.STRING)
    private TipoPerfil perfil;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoPerfil getPerfil() {
        return perfil;
    }

    public void setPerfil(TipoPerfil perfil) {
        this.perfil = perfil;
    }
}