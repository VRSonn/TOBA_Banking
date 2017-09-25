/*
Create a UserDB class with an insert method that inserts the new customer in the db.
Will need to create a DBUtil for the entity manager and factory.
 */
package data;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import userJavaBean.User;

public class UserDB {
    
    public static void insert(User user){
        // Call the enitity manager factory and set to em
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        //call the getTransaction from the entity manager set to trans (transaction)
        EntityTransaction trans = em.getTransaction();
        try{
            trans.begin();
            em.persist(user);
            trans.commit();
        }   
        // catch exceptions and roll back so data isnt lost or damaged
        catch (Exception ex){
          trans.rollback();
        }
        //close the enitiy manager
        finally{
            em.close();
            
        }  
    }   
}
