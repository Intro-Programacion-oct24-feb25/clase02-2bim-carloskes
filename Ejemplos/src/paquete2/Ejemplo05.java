/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        

        // arreglo de tipo entero
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese el numero de elementos");
        // Se asigna valores al arreglo
        int numero_elementos = entrada.nextInt();
        
        int[] arreglo1 = new int[numero_elementos];
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %d\n",
                    i, arreglo1[i]);
        }
        
    }

}