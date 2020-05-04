/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.dao;

import br.com.gemeos.escolacomtdd.conection.PersistenceUtil;
import br.com.gemeos.escolacomtdd.model.Autor;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Pessoal
 */
public class AutorDao {

    private EntityManager em;
    private Query query;

    public void cadastrarAutor(Autor autor) {

        try {
            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
            System.out.println("cadastrado com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();

        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public Autor buscarAutor(String nomeAutor) throws Exception {
        try {
            em = PersistenceUtil.createEntityManager();
            query = em.createQuery("SELECT autor FROM Autor autor WHERE autor.nomeAutor LIKE :nomeAutor");
            query.setParameter("nomeAutor", nomeAutor + "%");
            return (Autor) query.getSingleResult();

        } catch (NoResultException nre) {
//            e.printStackTrace();
//            throw new Exception("Autor não Encontrado");
            return null;
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
}
