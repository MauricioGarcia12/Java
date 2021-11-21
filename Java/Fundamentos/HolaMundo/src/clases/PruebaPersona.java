package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "juan";
        persona1.apellido = "perez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println(persona2);
    }
}