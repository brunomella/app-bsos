/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.controller;

import br.com.bsos.app.modelo.ChamadoServico;
import br.com.bsos.app.modelo.Funcionario;
import br.com.bsos.app.repository.FuncionarioRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import java.util.Collection;

/**
 *
 * @author BrunoLuiz
 */
@Resource
public class FuncionarioController {

    private final FuncionarioRepository repository;
    private final Result result;

    public FuncionarioController(Result result, FuncionarioRepository repository) {
        this.result = result;
        this.repository = repository;
    }

    @Get("/funcionario/{funcionario.id}/editar")
    public void editar(Funcionario funcionario) {
        funcionario = repository.loadById(funcionario.getId());

        result.include("funcionario", funcionario).forwardTo(this).novo();
    }

    @Get("/funcionario/{funcionario.id}")
    public void exibir(Funcionario funcionario) {
        funcionario = repository.loadById(funcionario.getId());

        result.include("funcionario", funcionario);
    }

    @Get("/funcionario")
    public void listagem() {
        Collection<Funcionario> funcionarioList = repository.loadAll();

        result.include("funcionarioList", funcionarioList);
    }
   
    
    @Get("/funcionario/novo")
    public void novo() {

    }
        
    @Delete("/funcionario/{funcionario.id}")
    public void remover(Funcionario funcionario) {
        repository.remove(funcionario);

        result
                .include("message", "Funcionario removido com sucesso!")
                .redirectTo(this).listagem();
    }

    @Post("/funcionario")
    public void salvar(Funcionario funcionario) {

        funcionario = repository.save(funcionario);
        

        result
                .include("message", "Funcionario salvo com sucesso!")
                .redirectTo(this).listagem();
    }
}
