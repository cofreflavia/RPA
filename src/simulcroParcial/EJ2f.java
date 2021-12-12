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
public class EJ2f {

    public static void main(String[] args) {
        /*Este algoritmo realiza el ingreso de la cantidad de filas (de 1 hasta 10 sino salta error) del triangulo e invoca a un modulo que lo imprime*/
        int lineas;

        System.out.println("Ingrese la cantidad de filas del triangulo:");
        lineas = TecladoIn.readLineInt();
        System.out.println();
        if (lineas >= 1 && lineas <= 7) {
            unTriangulo(lineas);

        } else {
            System.out.println("ERROR!!");

        }

    }

    public static void unTriangulo(int cantFilas) {
        /**
         * Este metodo imprime un triangulo con numeros cantFilas: es la
         * cantidad de filas que forman el triangulo
         */
        int fila, col;

        for (fila = 1; fila <= cantFilas; fila++) {

            for (col = 1; col <= cantFilas - fila + 1; col++) {

                System.out.print(col);

            }

            System.out.println();
        }

    }

}
