/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

/**
 *
 * @author Mauricio
 */
public class Test {
    public static void main(String[] args) {
        var nombreArchivo ="prueva.txt";
        crearArchivo(nombreArchivo);
    }
}
