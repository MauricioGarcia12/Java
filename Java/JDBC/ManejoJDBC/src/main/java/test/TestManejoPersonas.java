
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;


public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        
        //insertando un objeto de tipo persona
        //Persona personaNueva = new Persona("Carlos","Esparza","cesparza@email","3334345456");
        //personaDAO.insertar(personaNueva);
        
        //modificar un objeto de persona existente
        //Persona personaModificar = new Persona(1,"Mauricio","Garcia","emailchingon","3343454310");
        //personaDAO.actualizar(personaModificar);
        //eLIMNAR Un registro
        Persona personaDelete = new Persona(1);
        personaDAO.eliminar(personaDelete);
        
        List<Persona> personas = personaDAO.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona: "+persona);
        });
        
        
    }
}
