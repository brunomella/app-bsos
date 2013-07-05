package br.com.bsos.app.modelo;

import br.com.bsos.app.modelo.util.AbstractEntity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author BrunoLuiz
 */
@NamedQuery(name = "Pessoa.nome",
        query = " SELECT p "
        + " FROM Pessoa p "
//        + " WHERE p.id = id "
        + " WHERE p.nome LIKE :nome ")
@Entity
@Table(name = "pessoa")
public class Pessoa extends AbstractEntity {

    @Column(name = "celular", length = 15)
    private String celular;
    @Column(name = "cpf", length = 18)
    private String cpf;
    @Column(name = "email", length = 150)
    private String email;
    @Column(name = "nome", length = 150)
    private String nome;
    @Column(name = "rg", length = 15)
    private String rg;
    @Column(name = "telefone", length = 15)
    private String telefone;
    @Column(name = "tipo", length = 8)
    private String tipo;
    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> enderecos;
    @OneToMany(mappedBy = "pessoa")
    private List<ChamadoServico> chamadoServicos;

    public Pessoa() {
    }

    public List<ChamadoServico> getChamadoServicos() {
        return chamadoServicos;
    }

    public void setChamadoServicos(List<ChamadoServico> chamadoServicos) {
        this.chamadoServicos = chamadoServicos;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
