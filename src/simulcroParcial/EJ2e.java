/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulcroParcial;

import utiles.TecladoIn;

/**
 *
 * @author Matrix
 */
public class EJ2e {

    public static void main(String[] args) {
        /*Este algoritmo realiza el ingreso de la cantidad de filas (de 1 hasta 10 sino salta error) del triangulo e invoca a un modulo que lo imprime*/
        int cantFilas;

        System.out.println("Ingrese la cantidad de filas del triangulo:");
        cantFilas = TecladoIn.readLineInt();
        System.out.println();
        if (cantFilas >= 1 && cantFilas <= 7) {
            piramide5(cantFilas);

        } else {
            System.out.println("ERROR!!");

        }

    }

    public static void piramide5(int n) {
        /**
         * Este metodo imprime un triangulo con numeros cantFilas: es la
         * cantidad de filas que forman el triangulo
         */
        int fila, col;

        for (fila = 1; fila <= n; fila++) {

            for (col = 1; col <= fila; col++) {

                System.out.print(col);
            }
            if (fila == n) {
                System.out.print(n);
            }
            System.out.println();
        }

    }

}
