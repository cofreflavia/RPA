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
public class EJ2h {

    public static void piramide8(int n) {
        /**
         * Este metodo imprime un triangulo n:es la cantidad de filas del
         * triangulo
         */
        int fila, col;
        for (fila = 1; fila <= n; fila++) {
            for (col = 1; col <= 2 * fila; col = col + 2) {
                System.out.print(col);

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        /*Este metodo pide el ingreso de las cantidad de filas para invocar un metodo el cual imprime un triangulo*/
        int cantFilas;
        System.out.println("Ingrese la cantidad de filas para el tringulo:");
        cantFilas = TecladoIn.readLineInt();
        System.out.println();
        piramide8(cantFilas);
    }

}
