
package test;

import domain.Empleado;
import domain.Gerente;


public class TestSobrescritura {
    public static void main(String[] args) {
        //Gerente gerente1 = new Gerente("Juan",30000,"Kks");
        //System.out.println(gerente1.obtenerDetalles());
        
        Empleado empleado = new Empleado("Juan",5000);
        //System.out.println(empleado.obtenerDetalles());
        imprimir(empleado);
        Gerente gerente = new Gerente("Karla",10000,"Contabilidad");
        //System.out.println(gerente.obtenerDetalles());
        //polimorfismo puede apuntar a comportamientos de hijos
        imprimir(gerente);

    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado: "+empleado.obtenerDetalles());
    }
            
}
