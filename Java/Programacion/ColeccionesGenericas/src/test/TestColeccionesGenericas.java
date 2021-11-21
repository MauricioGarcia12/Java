/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

public class TestColeccionesGenericas {
    
    public static void main(String[] args) {
        List <String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        //String elemento = miLista.get(0);
        //imprimir(miLista);
        
        Set <String> miSet = new HashSet <> ();
        miSet.add("lunes");
        miSet.add("Martes");
        miSet.add("miercoles");
        //imprimir(miSet);
        
        Map <String, String> mapa = new HashMap <>();
        mapa.put("Valor1", "Juan");
        mapa.put("Valor2", "Pedro");
        mapa.put("Valor3", "Karla");
        String elementoMapa = mapa.get("Valor1");
        imprimir(mapa.values());
    }

    public static void imprimir(Collection <String> coleccion) {
        coleccion.forEach(e -> {
            System.out.println(e);
        });
    }
}
