///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.bsos.app.dao.util;
//
//import javax.persistence.EntityManager;
//import org.hibernate.usertype.ParameterizedType;
//
//
//
///**
// *
// * @author BrunoLuiz
// */
//public class GenericDaoImpl {
//    /**
//* Esta classe é responsável por conter as operações genéricas para realização
//* do acesso aos dados do sistema.
//*
//* @author Samuel
//*
//* @param
//*/
//@SuppressWarnings("unchecked")
//public abstract class GenericDAOImpl {
//
// private EntityManager entityManager;
//
// private Class classePersistente;
//
// /**
//  * Contrutor que guarda o tipo atual da classe T.
//  */
// public GenericDAOImpl() {
//  this.classePersistente = (Class) ((ParameterizedType) getClass()
//    .getGenericSuperclass()).getActualTypeArguments()[0];
// }
//
// /**
//  * Atualiza o objeto que se encontra em memória.
//  *
//  * @param object
//  *            objeto a ser atualizado
//  */
// public final void refresh(T object) {
//  getEntityManager().refresh(object);
// }
//
// /**
//  * Executa o flush no entity manager.
//  *
//  */
// public final void flush() {
//  getEntityManager().flush();
// }
//
// /**
//  * Executa o flush no entity manager.
//  *
//  */
// public final void clear() {
//  flush();
//  getEntityManager().clear();
// }
//
// /**
//  * Executa o merge do objeto que se encontra em memória.
//  *
//  * @param objeto
//  *            a ser realizado o merge
//  * @return objeto que foi executado o merge
//  */
// public final T merge(T objeto) {
//  objeto = getEntityManager().merge(objeto);
//  return objeto;
// }
//
// /**
//  * Salva o objeto atual na base de dados.
//  *
//  * @param objeto
//  *            a ser salvo
//  */
// public final void salvar(T objeto) {
//  getEntityManager().persist(objeto);
// }
//
// /**
//  * Remove o objeto da base de dados.
//  *
//  * @param objeto
//  *            a ser removido
//  */
// public final void remover(T objeto) {
//  getEntityManager().remove(objeto);
// }
//
// /**
//  * Remove o objeto uma vez passado sua chave como parâmetro.
//  *
//  * @param chave
//  *            identificadora do objeto
//  */
// public final void removerPorChave(Integer chave) {
//  getEntityManager().createQuery(
//    "delete from " + getClassePersistente().getName()
//      + " where id = " + chave).executeUpdate();
// }
//
// /**
//  * Busca o objeto uma vez passado sua chave como parâmetro.
//  *
//  * @param chave
//  *            identificador
//  * @return Objeto do tipo T
//  */
// public final T buscarPorChave(Integer chave) {
//  T instance = null;
//  try {
//   instance = getEntityManager().find(getClassePersistente(), chave);
//  } catch (RuntimeException re) {
//   re.printStackTrace();
//  }
//  return instance;
// }
//
// /**
//  * Busca o objeto de acordo com o objeto preenchido com os valores passado
//  * como exemplo.
//  *
//  * @param objeto
//  *            utilizado para realizar a busca
//  * @param ordenacoes
//  *            lista de critérios de ordenação
//  * @return Lista de objetos retornada
//  */
// public final List buscarPorExemplo(T objeto, Order... ordenacoes) {
//  Session session = (Session) getEntityManager().getDelegate();
//  Example example = criaExemplo(objeto);
//  Criteria criteria = session.createCriteria(objeto.getClass()).add(
//    example);
//  for (int i = 0; i < ordenacoes.length; i++) {
//   criteria.addOrder(ordenacoes[i]);
//  }
//  return (List) criteria.list();
// }
//
// /**
//  * Busca o objeto de acordo com o objeto preenchido com os valores passado
//  * como exemplo.
//  *
//  * @param objeto
//  * @param indiceInicial
//  * @param indiceFinal
//  * @param ordenacoes
//  *            lista de critérios de ordenação.
//  * @return Lista de orden
//  */
// public final List buscarPorExemplo(T objeto, Integer indiceInicial,
//   Integer indiceFinal, Order... ordenacoes) {
//  Example example = criaExemplo(objeto);
//  Criteria criteria = criaCriteria().add(example);
//  criteria.setFirstResult(indiceInicial);
//  criteria.setMaxResults(indiceFinal);
//
//  for (int i = 0; i < ordenacoes.length; i++) {
//   criteria.addOrder(ordenacoes[i]);
//  }
//
//  return (List) criteria.list();
// }
//
// /**
//  * Retorna a quantidade total de objetos para aquela entidade específica.
//  *
//  * @return quantidade total de objetos
//  */
// public final int buscaQuantidadeTotal() {
//  Criteria criteria = criaCriteria();
//  criteria.setProjection(Projections.rowCount());
//  return (Integer) criteria.uniqueResult();
// }
//
// /**
//  * Busca todos os objetos para aquela entidade específica.
//  *
//  * @param ordenacoes
//  *            lista de ordenações para pesquisa
//  * @return lista de todos os objetos da entidade
//  */
// public List buscarTodos(Order... ordenacoes) {
//  List results = null;
//  try {
//   Query query = getEntityManager().createQuery(
//     "from " + getClassePersistente().getName()
//       + adicionaOrderByHql(ordenacoes));
//   results = query.getResultList();
//  } catch (RuntimeException re) {
//   re.printStackTrace();
//  }
//  return results;
// }
//
// /**
//  *
//  * Busca todos os objetos de uma entidade específica de um índice inicial
//  * até um índice final.
//  *
//  * @param indiceInicial
//  *            indice inicial da busca
//  * @param indiceFinal
//  *            indice final da pesquisa.
//  * @param ordenacoes
//  *            lista de ordenação a ser criado
//  * @return uma lista de objetos do tipo T
//  */
// public List buscarTodos(Integer indiceInicial,
//   Integer indiceFinal, Order... ordenacoes) {
//  List results = null;
//  try {
//   Query query = getEntityManager().createQuery(
//     "from " + getClassePersistente().getName()
//       + adicionaOrderByHql(ordenacoes));
//   query.setFirstResult(indiceInicial);
//   query.setMaxResults(indiceFinal);
//
//   results = (List) query.getResultList();
//  } catch (RuntimeException re) {
//   re.printStackTrace();
//  }
//  return results;
// }
//
// /**
//  * Utilizado para se injetar o Entity manager no DAO.
//  *
//  * @param entityManager
//  *            entity manager
//  */
// public void setEntityManager(EntityManager entityManager) {
//  this.entityManager = entityManager;
// }
//
// /**
//  * Utilizado para se utilizar o entity manager nos DAOS que herdam do DAO
//  * genérico.
//  *
//  * @return Entity manager.
//  */
// protected EntityManager getEntityManager() {
//  return entityManager;
// }
//
// /**
//  * Adiciona o orderBy no final da query a ser utilizada.
//  *
//  * @param ordenacoes
//  *            a serem utilizadas para a busca
//  * @return string com o orderBy
//  */
// protected final static String adicionaOrderByHql(Order... ordenacoes) {
//  String result = "";
//  if (ordenacoes.length > 0) {
//   StringBuilder builder = new StringBuilder(" order by ");
//   for (int i = 0; i < ordenacoes.length - 1; i++) {
//    builder.append(ordenacoes[i].toString());
//    builder.append(", ");
//   }
//   builder.append(ordenacoes[ordenacoes.length - 1]);
//   result = builder.toStri
//ng();
//  }
//
//  return result;
// }
//
// /**
//  * Busca a classe persistente do objeto utilizado na classe.
//  *
//  * @return classe persistente
//  */
// protected final Class getClassePersistente() {
//  return classePersistente;
// }
//
// /**
//  * Retorna o objeto da clases Criteria.
//  *
//  * @return um objeto do tipo Criteria do Hibernate
//  */
// protected final Criteria criaCriteria() {
//  Session session = (Session) getEntityManager().getDelegate();
//  return session.createCriteria(getClassePersistente());
// }
//
// /**
//  * Método utilizado para criar o objeto Example. Este objeto é utilizado
//  * para realizar a busca por exemplo.
//  *
//  * @param objeto
//  *            sobre o qual o Example será criado
//  * @return em objeto do tipo Example
//  */
// protected final Example criaExemplo(T objeto) {
//
//  Example example = Example.create(objeto);
//  example.enableLike(MatchMode.ANYWHERE);
//  example.excludeZeroes();
//  example.ignoreCase();
//
//  return example;
// }
//}
//}
