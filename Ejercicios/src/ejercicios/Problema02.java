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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos3 = new double[4][3];

        for (int fila = 0; fila < datos1.length; fila++) {
            for (int col = 0; col < datos1[fila].length; col++) {
                datos3[fila][col] = obtenerSuma(datos1[fila][col], datos2[fila][col]);
                System.out.printf("La suma de: %.2f + %.2f = %.2f\n",
                        datos1[fila][col],
                        datos2[fila][col],
                        datos3[fila][col]);
            }
        }
    }

    public static double obtenerSuma(double d, double c) {
        if (d <= 1) {
            return 1;
        } else {
            return d + c;
        }
    }
}
