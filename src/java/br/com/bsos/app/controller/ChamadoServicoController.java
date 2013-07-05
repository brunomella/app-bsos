/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.controller;

import br.com.bsos.app.component.UserSession;
import br.com.bsos.app.modelo.ChamadoServico;
import br.com.bsos.app.modelo.Funcionario;
import br.com.bsos.app.modelo.Pessoa;
import br.com.bsos.app.repository.ChamadoServicoRepository;
import br.com.bsos.app.repository.EnderecoRepository;
import br.com.bsos.app.repository.FuncionarioRepository;
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
public class ChamadoServicoController {

    private final PessoaRepository pRepository;
    private final EnderecoRepository enderecoRepo;
    private final FuncionarioRepository funcRepo;
    private final ChamadoServicoRepository repository;
    private final Result result;
    private final UserSession session;

    public ChamadoServicoController(UserSession session, Result result, PessoaRepository pRepository,
            EnderecoRepository enderecoRepo, ChamadoServicoRepository repository, FuncionarioRepository funcRepo) {
        this.result = result;
        this.session = session;
        this.funcRepo = funcRepo;
        this.pRepository = pRepository;
        this.enderecoRepo = enderecoRepo;
        this.repository = repository;
    }

    @Get("/chamadoServico/{chamadoServico.id}/editar")
    public void editar(ChamadoServico chamadoServico, Pessoa pessoa) {
        chamadoServico = repository.loadById(chamadoServico.getId());
        result.include("chamadoServico", chamadoServico).forwardTo(this).novo();
    }

//    @Get("/chamadoServico/{chamadoServico.id}")
//    public void exibir(ChamadoServico chamadoServico) {
//        chamadoServico = repository.loadById(chamadoServico.getId());
//        result.include("chamadoServico", chamadoServico);
//    }
    @Get("/chamadoServico")
    public void listagem() {
        Collection<Pessoa> pessoaList = pRepository.loadAll();
        Collection<ChamadoServico> chamadoServicoList = repository.loadAll();
        result.include("pessoaList", pessoaList);
        result.include("chamadoServicoList", chamadoServicoList);
    }

    public List<ChamadoServico> busca(String status) {
        result.include("status", status);
        return repository.busca(status);
    }

    @Get("/chamadoServico/{pessoa.id}/novoChamado")
    public void novoChamado(Pessoa pessoa, Funcionario funcionario) {
        Collection<Funcionario> funcList = funcRepo.loadAll();
        pessoa = pRepository.loadById(pessoa.getId());
        result.include("pessoa", pessoa)
                .include("funcList", funcList);
    }

    @Get("/chamadoServico/novo")
    public void novo() {
    }

//    @Path("/chamadoServico/pdf")
//    public Download pdfReport(Long  id) {
//        //aqui vc monta a coleção para ser usada como DataSource no jasper  
//        //e coloca seus parametros (se quiser) em um mapa de parametros...      
//        Collection<ChamadoServico> chamados =  repository.loadAll();
//        Map<String, Object> rel = new HashMap<String, Object>();   
//        rel.put("id", id); 
//        return jasperMaker.makePdf(
//                "chamadopdf.jasper",
//                chamados,
//                "chamado.pdf",
//                false,rel /*opcionalmenteObjetosParametrosPodemSerEnviadosOuNao*/);
//    }
    @Get("/chamadoServico/imprimir/{chamadoServico.id}")
    public void imprimir(ChamadoServico chamadoServico) {
//        Collection<Pessoa> pessoaList =  pRepository.loadAll();
//        Collection<Endereco> enderecoList = enderecoRepo.loadAll();
        chamadoServico = repository.loadById(chamadoServico.getId());
        result
                //                .include("pessoaList", pessoaList)
                //                .include("enderecoList", enderecoList)
                .include("chamadoServico", chamadoServico);
    }

    @Delete("/chamadoServico/{chamadoServico.id}")
    public void remover(ChamadoServico chamadoServico) {
        repository.remove(chamadoServico);
        result
                .include("message", "Chamado de Servico removido com sucesso!")
                .redirectTo(this).listagem();
    }

    @Post("/chamadoServico")
    public void salvar(ChamadoServico chamadoServico, Pessoa pessoa, Funcionario funcionario) {
        pessoa = pRepository.save(pessoa);

        chamadoServico.setPessoa(pessoa);
        chamadoServico = repository.save(chamadoServico);
        result
                .include("message", "Chamado de Servico salvo com sucesso!")
                .redirectTo(this).listagem();
    }
}
