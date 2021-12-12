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
public class EJ2d {

    public static void main(String[] args) {
        /*Este algoritmo realiza el ingreso de la cantidad de filas (de 1 hasta 10 sino salta error) del triangulo e invoca a un modulo que lo imprime*/
        int cantFilas;

        System.out.println("Ingrese la cantidad de filas del triangulo:");
        cantFilas = TecladoIn.readLineInt();
        System.out.println();
        if (cantFilas >= 1 && cantFilas <= 7) {
            unTriangulo(cantFilas);

        } else {
            System.out.println("ERROR!!");

        }

    }

    public static void unTriangulo(int n) {
        /**
         * Este metodo imprime un triangulo con numeros cantFilas: es la
         * cantidad de filas que forman el triangulo
         */
        int fila, col, veces;

        for (fila = 1; fila <= n; fila++) {
            veces = 1;

            while (veces <= fila) {

                System.out.print(fila);

                veces++;
            }

            System.out.println();
        }

    }

}
