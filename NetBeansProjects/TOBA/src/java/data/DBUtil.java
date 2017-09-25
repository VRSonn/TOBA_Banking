/*
 Get an entity manager factory for the UserDB.java. 
 */
package data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("TOBAPU");
    
    public static EntityManagerFactory getEmFactory() {
       return emf; 
    }
}
