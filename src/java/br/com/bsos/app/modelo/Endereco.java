package br.com.bsos.app.modelo;


import br.com.bsos.app.modelo.util.AbstractEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco extends AbstractEntity {

    @Column(name = "bairro", length = 100)
    private String bairro;
    @Column(name = "cidade", length = 100)
    private String cidade;
    @Column(name = "uf", length = 3)
    private String uf;
    @Column(name = "rua", length = 80)
    private String rua;
    @Column(name = "numero", length = 12)
    private String numero;
    @Column(name = "complemento", length = 6)
    private String complemento;
    @Column(name = "cep", length = 20)
    private String cep;
    @Column(name = "observacao", length = 200)
    private String observacao; 
    @ManyToOne
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
