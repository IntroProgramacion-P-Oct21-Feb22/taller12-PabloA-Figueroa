/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean bandera= true; 
        String cadena= "no";
        int i= 0;
        
        while( bandera){
            System.out.println("suma:"+ i + i);
            i = i+1;
             System.out.println("Ingrese si si quiere salir de la cadena");  
             cadena= entrada.nextLine();
             if(cadena.equals("si")){
                 bandera=false;
             }
        }
    }
}