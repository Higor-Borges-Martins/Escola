/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gemeos.biblioteca.conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pessoal
 */
public class PersistenceUtil {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("escolatdd");
    private static EntityManager em;
    
    public static EntityManager createEntityManager(){
        try{
            if(em == null || !em.isOpen()){
                em = emf.createEntityManager();
            }
            return em;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void closeEntityManagerFactory(){
        try{
            if(em != null && em.isOpen()){
                em.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
