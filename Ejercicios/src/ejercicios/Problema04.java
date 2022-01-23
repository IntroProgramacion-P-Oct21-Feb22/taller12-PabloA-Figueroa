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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];

        for (int fila = 0; fila < bases.length; fila++) {
            resultado[fila] = obtenerResultado(bases[fila], potencias[fila]);
            System.out.printf("El resultado de %.2f elevado a la %.2f = %.2f\n",
                    bases[fila],
                    potencias[fila],
                    resultado[fila]);
        }
    }

    public static double obtenerResultado(double d, double c) {
        if (d <= 1) {
            return 1;
        } else {
            return Math.pow(d,c);
        }
    }
}
