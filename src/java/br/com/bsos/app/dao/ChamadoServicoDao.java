/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.dao;

import br.com.bsos.app.dao.util.GenericDao;
import br.com.bsos.app.modelo.ChamadoServico;
import br.com.bsos.app.repository.ChamadoServicoRepository;
import br.com.caelum.vraptor.ioc.Component;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import org.hibernate.Session;

/**
 *
 * @author BrunoLuiz
 */
@Component
public class ChamadoServicoDao extends GenericDao<ChamadoServico> implements ChamadoServicoRepository {

    private static Logger log = Logger.getLogger(PessoaDao.class);

    public ChamadoServicoDao(EntityManager manager) {
        super(manager);
    }

//    @Override
//    public List<Pessoa> buscarPessoa(String nome, Long id) {
//        String sql = "select c, cf from Cliente c "
//                + "join c.clientesFidelidades cf "
//                + "join cf.idFidelidade f "
//                + "join f.idEmpresa e "
//                + "where e.id = :id and c.nome like :nome order by c.nome asc";
//        try {
//            Query query = manager.createQuery(sql);
//            query.setParameter("id", id);
//            query.setParameter("nome", "%" + nome + "%");
//
//            return query.getResultList();
//        } catch (NoResultException ex) {
//            log.error(ex);
//            return null;
//        }
//    }
    @Override
    public List<ChamadoServico> busca(String nome) {
        String sql = "select chamadoservico.status, pessoa.nome"
                + " from chamadoservico "
                + "inner join pessoa on pessoa.id = chamadoservico.id";
        try {
            Query q = manager.createQuery(sql);
//            q.setParameter("id", id);
            q.setParameter("nome", "%" + nome + "%");
            return q.getResultList();
        } catch (NoResultException ex) {

            log.error(ex);
            return null;
        }
    }
}
