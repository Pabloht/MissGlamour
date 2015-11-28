/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cor;
import Model.Marca;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.RollbackException;

import util.EntityManagerUtil;
/**
 *
 * @author PabloHenrique
 */
public class MarcaDao {
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    public void  incluirMarca(Marca m) throws RollbackException , Exception {
        
		String retorno = "Marca gravada com sucesso";
		
		//EntityTransaction tx = getEntityManager().getTransaction();
		 EntityManager em = null;
        try {
            //tx.begin();
            em = getEntityManager();
            //getEntityManager().persist(m);
            em.getTransaction().begin();
            //tx.commit();
            em.persist(m);
            em.getTransaction().commit();
        } catch (Exception ex) {
            try {
                em.getTransaction().rollback();
            } catch (Exception re) {
                
            }
//            System.out.println("erro " + t);
//            t.printStackTrace();
//            
//            tx.rollback();
            throw ex;
            
       // } finally {
            
       // }
		
		
		
	}
    }
}

