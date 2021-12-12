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
public class EJ2i {

    public static void piramide9(int n) {
        /**
         * Este metodo imprime un triangulo n:es la cantidad de filas del
         * triangulo
         */
        int fila, col;
        char res = 'a';
        for (fila = 1; fila <= n; fila++) {
     
            for (col = 1; col <= n-fila+1; col++) {
                switch (fila) {
                    case 1:
                        res = 'A';
                        break;
                    case 2:
                        res = 'B';
                        break;
                    case 3:
                        res = 'C';
                        break;
                    case 4:
                        res = 'D';
                        break;

                }
                System.out.print(res);

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
        piramide9(cantFilas);
    }
}
