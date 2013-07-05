/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.dao;

import br.com.bsos.app.dao.util.GenericDao;
import br.com.bsos.app.modelo.Pessoa;
import br.com.bsos.app.repository.PessoaRepository;
import br.com.caelum.vraptor.ioc.Component;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author BrunoLuiz
 */
@Component
public class PessoaDao extends GenericDao<Pessoa> implements PessoaRepository {
    
   
    
    public PessoaDao(EntityManager manager) {
        
        super(manager);
    }

    @Override
    public List<Pessoa> busca(String nome) {
    manager.getEntityManagerFactory();
    Query query = manager.createNamedQuery("Pessoa.nome");
    query.setParameter("nome", "%" + nome + "%");
    return query.getResultList();
  }
        
}
