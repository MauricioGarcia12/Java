/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentos;

/**
 *
 * @author Mauricio
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1,3,4);
        imprimirNumeros(3,2);
        variosParametros("juan", 2,3,6);
    }
    private static void imprimirNumeros(int... numeros){
        //Un arreglo sin necesidad de especificar su espacio
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    private static void variosParametros(String nombre, int... numeros){
        System.out.println(nombre);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
            
        }
    }
    

}
