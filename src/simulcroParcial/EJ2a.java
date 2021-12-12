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
public class EJ2a {

    public static void main(String[] args) {
        //Este algoritmo realiza el ingreso del simbolo y la cantidad de lineas del triangulo e invoca a un modulo
        int cantLineas;
        char caracter;
        System.out.println("Ingrese la cantidad de filas del triangulo:");
        cantLineas = TecladoIn.readLineInt();
        System.out.println("Ingrese el simbolo con el que se formara el triangulo");
        caracter = TecladoIn.readLineNonwhiteChar();
        System.out.println();

        unTriangulo(caracter, cantLineas);

    }

    public static void unTriangulo(char simbolo, int lineas) {
        /**
         * Este metodo imprime un triangulo simbolo: es un caracter de un
         * simbolo ingresado como parametro lineas: es la cantidad de lineas que
         * forman el triangulo
         */
        int fila, col;
        for (fila = 1; fila <= lineas; fila++) {
            for (col = 1; col <= fila; col++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }

    }

}
