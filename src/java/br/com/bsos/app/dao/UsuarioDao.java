package br.com.bsos.app.dao;

import javax.persistence.EntityManager;
import br.com.caelum.vraptor.ioc.Component;
import br.com.bsos.app.dao.util.GenericDao;
import br.com.bsos.app.modelo.Usuario;
import br.com.bsos.app.repository.UsuarioRepository;
import org.hibernate.Session;

@Component
public class UsuarioDao extends GenericDao<Usuario> implements UsuarioRepository {

	public UsuarioDao(EntityManager manager) {
	  super(manager);
	}

}