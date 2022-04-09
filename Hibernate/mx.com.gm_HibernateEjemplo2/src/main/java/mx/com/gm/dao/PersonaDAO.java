package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

public class PersonaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();

    }

    public void listar() {
        String hql = "SELECT p FROM Persona p";
        //ejecutar query
        Query query = em.createQuery(hql);
        //recuperar lista
        List<Persona> personas = query.getResultList();
        //imprimir objetos
        for (Persona p : personas) {
            System.out.println("p =" + p);
        }
    }

    public void insertar(Persona persona) {
        try {
            //empezar transaccion
            em.getTransaction().begin();
            //guardar en bd
            em.persist(persona);
            //commit
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();

        } finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public void modificar(Persona persona){
         try {
            //empezar transaccion
            em.getTransaction().begin();
            //sincronizar con UPDATE 
            em.merge(persona);
            //commit
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();

        } /*finally{
            if(em != null){
                em.close();
            }
            
            }
         */
    }
    public Persona buscarPersonaPorId(Persona p){
      return   em.find(Persona.class, p.getIdPersona());
    }
    public void eliminar (Persona persona){
         try {
            //empezar transaccion
            em.getTransaction().begin();
            //sincronizar con UPDATE 
            em.remove(em.merge(persona));
            //commit
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();

        } /*finally{
            if(em != null){
                em.close();
            }
            
            }
         */
    }
    

}
