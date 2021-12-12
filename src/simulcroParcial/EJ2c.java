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
public class EJ2c {

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
        int fila, veces;

        for (fila = 1; fila <= cantFilas; fila++) {
            veces = 1;

            while (veces <= fila) {

                System.out.print(transformar(fila));
                veces++;

            }

            System.out.println();
        }

    }

    public static char transformar(int i) {
        char res = 'a';
        switch (i) {
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
            case 5:
                res = 'E';
                break;
            case 6:
                res = 'F';
                break;
            case 7:
                res = 'G';
                break;

        }
        return (res);
    }
}
