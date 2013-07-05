package br.com.bsos.app.modelo;

import br.com.bsos.app.modelo.util.AbstractEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@NamedQuery(status = "chamadoServico.status",
//        query = " SELECT chamadoservico.`status`, pessoa.nome "
//        + " FROM chamadoServico"
//        + "inner join pessoa on pessoa.id = chamadoServico.id"
//        + " WHERE p.nome LIKE :nome ")

@Entity
@Table(name = "chamadoServico")
public class ChamadoServico extends AbstractEntity implements Serializable {

    @Column(name = "defeito", length = 150)
    private String defeito;
    @Column(name = "observacao", length = 150)
    private String observacao;
    @Column(name = "status", length = 150)
    private String status;
    @Temporal(TemporalType.DATE)
    private Date dataEntradaServico;
    @ManyToOne
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataEntradaServico() {
        return dataEntradaServico;
    }

    public void setDataEntradaServico(Date dataEntradaServico) {
        this.dataEntradaServico = dataEntradaServico;
    }
}
