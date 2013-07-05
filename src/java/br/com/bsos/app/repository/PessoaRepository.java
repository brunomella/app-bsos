/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.repository;

import br.com.bsos.app.modelo.Pessoa;
import br.com.bsos.app.repository.util.GenericRepository;
import java.util.List;


/**
 *
 * @author BrunoLuiz
 */
public interface PessoaRepository extends GenericRepository<Pessoa> {

    public List<Pessoa> busca(String nome);

  
    	
}
