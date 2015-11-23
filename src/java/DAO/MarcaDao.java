/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Marca;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
    public String  incluirMarca(Marca m){
		String retorno = "Marca gravada com sucesso";
		
		EntityTransaction tx = getEntityManager().getTransaction();
		 
        try {
            tx.begin();
            
            getEntityManager().persist(m);
            
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            
        }
		
		return retorno;
		
	}
}
