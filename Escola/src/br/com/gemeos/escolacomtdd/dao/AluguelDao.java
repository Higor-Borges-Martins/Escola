/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.dao;

import br.com.gemeos.escolacomtdd.conection.PersistenceUtil;
import br.com.gemeos.escolacomtdd.model.Aluguel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Pessoal
 */
public class AluguelDao {

    EntityManager em;
    Query query;

    public void alugarLivro(Aluguel alugar) {
        try {

            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            em.persist(alugar);
            em.getTransaction().commit();
            System.out.println("Aluguel efetuado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }

    }

      public List<Aluguel> listarAlugueis() throws Exception {

        try {

            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            query = em.createQuery("SELECT alugar FROM Aluguel alugar");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Lista Vazia");
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public Aluguel pesquisarAluguel(long registro) throws Exception {
        try {
            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            query = em.createQuery("SELECT alugar FROM Aluguel alugar WHERE alugar.registro = :registro");
            query.setParameter("registro", registro);
            return (Aluguel) query.getSingleResult();
        } catch (NoResultException nre) {
          return null;
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public void DevolverLivro(Aluguel alugar) throws Exception {

        try {
            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            alugar = em.merge(alugar);
            em.getTransaction().commit();
            System.out.println("Livro Devolvido");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new Exception("Falha ao realisar a função");
        }
    }
}
