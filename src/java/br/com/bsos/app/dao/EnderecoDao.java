/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.dao;


import br.com.bsos.app.dao.util.GenericDao;
import br.com.bsos.app.modelo.Endereco;
import br.com.bsos.app.repository.EnderecoRepository;
import br.com.caelum.vraptor.ioc.Component;
import javax.persistence.EntityManager;
import org.hibernate.Session;

/**
 *
 * @author BrunoLuiz
 */
@Component
public class EnderecoDao extends GenericDao<Endereco> implements EnderecoRepository {

	public EnderecoDao(EntityManager manager) {
	  super(manager);
	}
    
}
