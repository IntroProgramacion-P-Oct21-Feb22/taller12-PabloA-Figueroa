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
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] suma = new double[5];

        for (int fila = 0; fila < datos.length; fila++) {
            suma[fila] = obtenerResultado(datos[fila], datos2[fila]);
            System.out.printf("La suma de: %.2f + %.2f = %.2f\n",
                    datos[fila],
                    datos2[fila],
                    suma[fila]);
        }
    }


        public static double obtenerResultado(double d, double c) {
        if (d <= 1) {
            return 1;
        } else {
            return d + c;
        }
    }
}