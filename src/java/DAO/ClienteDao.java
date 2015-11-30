/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import Model.Marca;
import javax.persistence.EntityManager;
import javax.persistence.RollbackException;
import util.EntityManagerUtil;

/**
 *
 * @author PabloHenrique
 */
public class ClienteDao {
    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();
    public EntityManager getEntityManager() {
        return entityManager;
    }
     public void  incluirCliente(Cliente c) throws RollbackException , Exception  {
  
		EntityManager em = null;
        try {            
            em = getEntityManager();           
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception ex) {
            try {
                em.getTransaction().rollback();
            } catch (Exception re) {
                System.out.println(re);
            }

            throw ex;	
		
	}
    }
}
