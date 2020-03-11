/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.dao;

import br.com.gemeos.escolacomtdd.conection.PersistenceUtil;
import br.com.gemeos.escolacomtdd.model.Professor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Pessoal
 */
public class ProfessorDao {

    private EntityManager em;
    private Query query;

    public ProfessorDao() {
    }

    public void cadastrarProfessor(Professor prof) {

        try {
            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            em.persist(prof);
            em.getTransaction().commit();
            System.out.println("Cadastrado com Sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public List<Professor> listarProfessor() throws Exception {
        em = PersistenceUtil.createEntityManager();
        try {

            em.getTransaction().begin();
            query = em.createQuery("SELECT p FROM Professor p");
            em.getTransaction().commit();
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Lista Vazia");
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public Professor buscarProfessor(String cpf) throws Exception {

        em = PersistenceUtil.createEntityManager();
        try {
            em.getTransaction().begin();
            query = em.createQuery("SELECT p FROM Professor p WHERE p.cpf LIKE :cpf");
            query.setParameter("cpf", cpf + "%");
            return (Professor) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Professor não Encontrado");
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }

    public void editarProfessor(Professor prof) throws Exception {
        em = PersistenceUtil.createEntityManager();
        try {
            em.getTransaction().begin();;
            em.merge(prof);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new Exception("Falha ao Editar");
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
    
    public void removerProfessor(Professor prof)throws Exception{
        em = PersistenceUtil.createEntityManager();
        try {
            em.getTransaction().begin();
            prof = em.merge(prof);
            em.remove(prof);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
             throw new Exception("Falha ao excluir");
        }finally{
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
}
