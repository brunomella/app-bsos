package br.com.bsos.app.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.bsos.app.annotation.Permission;
import br.com.bsos.app.modelo.util.TipoPerfil;

@Resource
@Permission(TipoPerfil.ADMINISTRADOR)
public class AdminController {

	@Get("/admin")
	public void admin() {

	}

}