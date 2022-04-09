
package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;


public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.listar();
        
        Persona persona = new Persona();
        //id del objeto que se quiere modificar
        persona.setIdPersona(5);
        
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("Persona encontrada" +persona);
        //persona.setNombre("Anahi");
        //persona.setApellido("Modificado");
        //persona.setEmail("modificado@gmail.com");
        //persona.setTelefono("33234556");
        
        //personaDao.insertar(persona);
        //personaDao.modificar(persona);
        personaDao.eliminar(persona);
        personaDao.listar();
        
        
    }
}
