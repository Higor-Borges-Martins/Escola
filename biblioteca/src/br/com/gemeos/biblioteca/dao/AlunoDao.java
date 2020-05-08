/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.biblioteca.dao;

import br.com.gemeos.biblioteca.modal.Aluno;
import br.com.gemeos.biblioteca.util.Conversor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import br.com.gemeos.biblioteca.conection.PersistenceUtil;
import javax.persistence.Query;

/**
 *
 * @author Pessoal
 */
public class AlunoDao {
    
    private EntityManager em;
    private Query query;
    private Conversor conversor;
    ArrayList<Aluno> alunos;
    
    public AlunoDao() {
        conversor = new Conversor();
        alunos = new ArrayList();
    }
    
    public void cadastrarAluno(Aluno a) {
        
        em = PersistenceUtil.createEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
            System.out.println("Cadastrado com sucesso");
            
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
    
    public List<Aluno> listarAlunos() throws Exception {
        
        try {
            em = PersistenceUtil.createEntityManager();
            query = em.createQuery(" SELECT a FROM Aluno a");
            
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Lista não encontrada");
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
        
    }
    
    public Aluno buscarAluno(String cpf) throws Exception {
        
        try {
            em = PersistenceUtil.createEntityManager();
            query = em.createQuery("SELECT a FROM Pessoa a WHERE a.cpf LIKE :cpf");
            query.setParameter("cpf", cpf + "%");
            return (Aluno) query.getSingleResult();
        } catch (NoResultException nre) {
            return null;
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
    
    public void editarAluno(Aluno aluno) throws Exception {
        
        try {
            
            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            em.merge(aluno);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new Exception("Falha ao Editar");
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
    
    public void removerAluno(Aluno aluno) throws Exception {
        
        try {
            em = PersistenceUtil.createEntityManager();
            em.getTransaction().begin();
            aluno = em.merge(aluno);
            em.remove(aluno);
            em.getTransaction().commit();
            System.out.println("Removido com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new Exception("Falha ao remover!");
        } finally {
            PersistenceUtil.closeEntityManagerFactory();
        }
    }
    
    public long gerarMatricula() throws Exception {
        
        long numeroDaMatricula = 0;
        try {
            
            for (Aluno perc : listarAlunos()) {
                numeroDaMatricula = numeroDaMatricula + 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Falha ao gerar matricula");
        }
        return numeroDaMatricula;
    }
}
