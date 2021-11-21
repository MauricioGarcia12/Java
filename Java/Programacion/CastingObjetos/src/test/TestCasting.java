
package test;

import domain.*;


public class TestCasting {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("juan", 5000,TipoEscritura.CLASICO);
        //System.out.println(empleado.obtenerDetalles());
        
        //COnvirtiendo downcasting
        //((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        Empleado empleado2=escritor;
        empleado2.obtenerDetalles();
    }
 
}
