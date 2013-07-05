/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.dao;

import br.com.bsos.app.dao.util.GenericDao;
import br.com.bsos.app.modelo.Funcionario;
import br.com.bsos.app.repository.FuncionarioRepository;
import br.com.caelum.vraptor.ioc.Component;
import javax.persistence.EntityManager;

/**
 *
 * @author BrunoLuiz
 */
@Component
public class FuncionarioDao extends GenericDao<Funcionario> implements FuncionarioRepository {

	public FuncionarioDao(EntityManager manager) {
	  super(manager);
	}
    
}
