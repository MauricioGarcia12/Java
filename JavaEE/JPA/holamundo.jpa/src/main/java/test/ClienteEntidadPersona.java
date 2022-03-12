
package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;


public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        
        //Inicia transaccion
        tx.begin();
        
        //No se debe especificar el ID DE LA BD
        Persona persona1 = new Persona("Mau", "Rick", "mr@mail.com", "333333");
        log.debug("Objeto a persistir"+persona1);
        //PERSISTIR EN LA BD 
        em.persist(persona1);
        //terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido");
        em.close();
    }
            
}
