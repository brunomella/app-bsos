package br.com.bsos.app.component;

import br.com.bsos.app.modelo.Usuario;
import java.io.Serializable;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;


@Component
@SessionScoped
public class UserSession implements Serializable {

	private static final long serialVersionUID = 9120380330411537761L;

	private Usuario user;

	public boolean isLogged() {
		return user != null;
	}

	public void logout() {
		user = null;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

}