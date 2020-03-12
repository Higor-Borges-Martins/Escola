/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.dao;

import br.com.gemeos.escolacomtdd.conection.PersistenceUtil;
import br.com.gemeos.escolacomtdd.model.Livro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 *
 * @author Pessoal
 */
public class LivroDao {

    EntityManager em;
    Query query;

    public void salvarLivro(Livro l) {

        try {

            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            em.persist(l);
            em.getTransaction().commit();
            System.out.println("Cadastra com Sucesso");
        } catch (Exception e) {

            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public List<Livro> listarLivro() throws Exception {

        try {

            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            query = em.createQuery("SELECT l FROM Livro l");
            return query.getResultList();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Lista Vazia");
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public Livro buscarLivro(String titulo) throws Exception {

        try {

            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            query = em.createQuery("SELECT l FROM Livro l WHERE l.titulo LIKE :titulo");
            query.setParameter("titulo", titulo + "%");
            return (Livro) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(" Livro não encontrado!");
        }finally{
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
    
    public void atualisarQuantidadeLivro(Livro l){
        em = PersistenceUtil.createEntityManager();
    }
}
