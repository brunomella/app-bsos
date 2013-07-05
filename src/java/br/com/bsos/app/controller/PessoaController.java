/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.controller;

import static br.com.caelum.vraptor.view.Results.*;
import br.com.bsos.app.annotation.Permission;
import br.com.bsos.app.component.UserSession;
import br.com.bsos.app.modelo.ChamadoServico;
import br.com.bsos.app.modelo.Endereco;
import br.com.bsos.app.modelo.Pessoa;
import br.com.bsos.app.modelo.util.TipoPerfil;
import br.com.bsos.app.repository.ChamadoServicoRepository;
import br.com.bsos.app.repository.EnderecoRepository;
import br.com.bsos.app.repository.PessoaRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author BrunoLuiz
 */
@Resource
@Permission({TipoPerfil.USUARIO, TipoPerfil.ADMINISTRADOR})
public class PessoaController {

    private final EnderecoRepository erpo;
    private final ChamadoServicoRepository osrpo;
    private final PessoaRepository repository;
    private final UserSession session;
    private final Result result;

    public PessoaController(Result result, UserSession session, PessoaRepository repository, EnderecoRepository erpo, ChamadoServicoRepository osrpo) {
        this.result = result;
        this.session = session;
        this.repository = repository;
        this.erpo = erpo;
        this.osrpo = osrpo;
    }

    public List<Pessoa> busca (String nome) {
        result.include("nome", nome);
        return repository.busca(nome);
    }

    @Get("/pessoa/busca.json")
    public void buscaJson(String q) {
        result.use(json()).withoutRoot()
                .from(repository.busca(q))
                .exclude("id", "cpf")
                .serialize();
    }

    @Get("/pessoa/{pessoa.id}/editar")
    public void editar(Pessoa pessoa, Endereco endereco) {
        endereco = erpo.loadById(pessoa.getId());
        pessoa = repository.loadById(pessoa.getId());
        if ("Física".equals(pessoa.getTipo())) {
            result.include("endereco", endereco)
                    .include("pessoa", pessoa).forwardTo(this).novoF();
        } else {
            result.include("endereco", endereco)
                    .include("pessoa", pessoa).forwardTo(this).novoJ();
        }
    }

    @Get("/pessoa/{pessoa.id}")
    public void exibir(Pessoa pessoa) {
        pessoa = repository.loadById(pessoa.getId());
        result.include("pessoa", pessoa);
    }

    @Get("/pessoa")
    public void listagem() {

        Collection<Pessoa> pessoaList = repository.loadAll();
        erpo.loadAll();
        result.include("pessoaList", pessoaList);
    }

    @Get("/pessoa/novoF")
    public void novoF() {
    }

    @Get("/pessoa/novoJ")
    public void novoJ() {
    }

    @Get("/pessoa/novo")
    public void novo() {
    }

    @Delete("/pessoa/{pessoa.id}")
    public void remover(Pessoa pessoa, Endereco endereco, ChamadoServico ordemServico) {
        endereco = erpo.loadById(pessoa.getId());
        erpo.remove(endereco);
        repository.remove(pessoa);
        result.include("message", "Cadastro removido com sucesso!").redirectTo(this).listagem();


    }

    @Post("/pessoa")
    public void salvar(Pessoa pessoa, Endereco endereco) {

        pessoa = repository.save(pessoa);
        endereco.setPessoa(pessoa);
        endereco = erpo.save(endereco);

        result
                .include("message", "Cadastro salvo com sucesso!")
                .redirectTo(this).listagem();
    }
//    public List<Pessoa> busca(String busca) {
//        result.include("busca", busca);
//        List<Pessoa> lista = repository.buscar(busca, session.getEmpresa().getId());
//        result.include("pessoaList", lista);
//        return lista;
//    }
}
