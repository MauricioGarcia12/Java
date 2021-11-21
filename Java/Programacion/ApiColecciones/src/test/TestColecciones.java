/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

public class TestColecciones {
    
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        Set miSet = new HashSet();
        miSet.add("lunes");
        miSet.add("Martes");
        miSet.add("miercoles");
        
        Map mapa = new HashMap();
        mapa.put("Valor1", "Juan");
        mapa.put("Valor2", "Pedro");
        mapa.put("Valor3", "Karla");
        
        String elemento = (String) mapa.get("Valor1");
        
        imprimir(mapa.values());
        imprimir(mapa.keySet());
        imprimir(miSet);
        imprimir(miLista);
    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach(e -> {
            System.out.println(e);
        });
    }
}
