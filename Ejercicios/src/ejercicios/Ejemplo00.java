/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Ejemplo00 {

    public static void main(String[] args) {
        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        } 
        /*El programa envia el arreglo datos y el tamaño del arreglo a la funcion misterio
        Donde si el tamaño del arreglo datos es igual a 1, devolveria arreglo datos en la posicion 0
        y caso contrario devolveria el tamaño del arreglo -1 + la funcion misterio que se vuelve a llamar
        enviando el arreglo datos y el tamaño del arreglo -1, generando asi un proceso recursivo, 
        finalizaando con la suma de todos los valores del arreglo*/
    }

}
