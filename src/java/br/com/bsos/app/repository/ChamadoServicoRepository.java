/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bsos.app.repository;

import br.com.bsos.app.modelo.ChamadoServico;
import br.com.bsos.app.repository.util.GenericRepository;
import java.util.List;




/**
 *
 * @author BrunoLuiz
 */
public interface ChamadoServicoRepository extends GenericRepository<ChamadoServico> {

    public List<ChamadoServico> busca(String status);
    
//    List<Pessoa> buscarPessoa(String nome, Long id);
//    List<ChamadoServico> buscarChamado(String nome, Long id);

}
