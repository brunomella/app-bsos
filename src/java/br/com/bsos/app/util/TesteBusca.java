/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.util;

import br.com.bsos.app.modelo.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author BrunoLuiz
 */
public class TesteBusca {
    public static void main(String[] args) {

    EntityManagerFactory factory = Persistence.
        createEntityManagerFactory("default");
      EntityManager manager = factory.createEntityManager();

    //cuidado, use o import javax.persistence.Query
    Query query = manager
        .createQuery("select p from Pessoa as p "+
          "where p.nome = :nome");
    query.setParameter("nome", true);
    
    List<Pessoa> lista = query.getResultList();

    for (Pessoa p : lista) {
      System.out.println(p.getNome());
    }

    manager.close();
  }
}
