package br.com.bsos.app.controller;

import java.util.Collection;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.bsos.app.annotation.Permission;
import br.com.bsos.app.modelo.Usuario;
import br.com.bsos.app.modelo.util.TipoPerfil;
import br.com.bsos.app.repository.UsuarioRepository;

@Resource
public class UsuarioController {

    private final UsuarioRepository repository;
    private final Result result;

    public UsuarioController(Result result, UsuarioRepository repository) {
        this.result = result;
        this.repository = repository;
    }

    @Get("/usuario/{usuario.id}/editar")
    public void editar(Usuario usuario) {
        usuario = repository.loadById(usuario.getId());

        result.include("usuario", usuario).forwardTo(this).novo();
    }

    @Get("/usuario/{usuario.id}")
    public void exibir(Usuario usuario) {
        usuario = repository.loadById(usuario.getId());

        result.include("usuario", usuario);
    }

    @Get("/usuario")
    public void listagem() {
        Collection<Usuario> usuarioList = repository.loadAll();

        result.include("usuarioList", usuarioList);
    }

    @Get("/negado")
    public void negado() {
    }

    @Get("/usuario/novo")
    public TipoPerfil[] novo() {
        return TipoPerfil.values();
    }

    @Permission({TipoPerfil.USUARIO, TipoPerfil.ADMINISTRADOR})
    @Delete("/usuario/{usuario.id}")
    public void remover(Usuario usuario) {
        repository.remove(usuario);

        result
                .include("message", "Usuário removido com sucesso!")
                .redirectTo(this).listagem();
    }

    @Post("/usuario")
    public void salvar(Usuario usuario) {
        usuario = repository.save(usuario);

        result
                .include("message", "Usuário salvo com sucesso!")
                .redirectTo(this).listagem();
    }
}