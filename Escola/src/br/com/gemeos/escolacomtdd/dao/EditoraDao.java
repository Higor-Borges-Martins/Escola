/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.dao;

import br.com.gemeos.escolacomtdd.conection.PersistenceUtil;
import br.com.gemeos.escolacomtdd.model.Editora;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Pessoal
 */
public class EditoraDao {

    private EntityManager em;
    private Query query;

    public void cadastrarEditora(Editora editora) {

        try {
            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            em.persist(editora);
            em.getTransaction().commit();
            System.out.println("Cadastrado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public Editora buscarEditora(String nomeEditora) throws Exception {
        try {
        em = PersistenceUtil.createEntityManager();
        query = em.createQuery("SELECT editora FROM Editora editora WHERE editora.nomeEditora LIKE :nomeEditora");
        query.setParameter("nomeEditora", nomeEditora +"%");
        return (Editora) query.getSingleResult();
            
        } catch (NoResultException nre) {
            return null;
//            e.printStackTrace();
//            throw new Exception("Não encontrado");
        }finally{
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
}
