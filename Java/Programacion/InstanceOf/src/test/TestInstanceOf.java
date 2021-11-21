
package test;

import domain.Empleado;
import domain.Gerente;


public class TestInstanceOf {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Juan",5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla",10000,"Contabilidad");

        determinarTipo(empleado);

    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es tipo gerente");
            Gerente gente= (Gerente)empleado;
            System.out.println(((Gerente) empleado).getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es tipo Empleado");
        }
    }
            
}
