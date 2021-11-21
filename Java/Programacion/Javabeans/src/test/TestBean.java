
package test;

import domain.PersonaBean;


public class TestBean {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("juan");
        persona.setApellido("garcia");
        System.out.println(persona.toString());
        
    }
}
