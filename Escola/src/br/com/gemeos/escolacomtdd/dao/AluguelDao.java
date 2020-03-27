/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.escolacomtdd.dao;

import br.com.gemeos.escolacomtdd.conection.PersistenceUtil;
import br.com.gemeos.escolacomtdd.model.Aluguel;
import br.com.gemeos.escolacomtdd.model.Livro;
import javax.persistence.Entity;
import javax.persistence.EntityManager;

/**
 *
 * @author Pessoal
 */
public class AluguelDao {

    EntityManager em;

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
        }finally{
            PersistenceUtil.closeEntityManagerFactory();
        }

    }


}
