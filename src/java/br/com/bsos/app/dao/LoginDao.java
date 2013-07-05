package br.com.bsos.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;
import br.com.bsos.app.modelo.Usuario;
import br.com.bsos.app.repository.LoginRepository;

@Component
public class LoginDao implements LoginRepository {

	private EntityManager manager;

	public LoginDao(EntityManager manager) {
		this.manager = manager;
	}

	public Usuario autenticar(String email, String senha) {
		try {
			Query query = manager.createQuery("from Usuario where email = :email and senha = :senha");
			query.setParameter("email", email);
			query.setParameter("senha", senha);
			return (Usuario) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}