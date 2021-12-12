/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN6Repetitiva;

import utiles.TecladoIn;

/**
 *
 * @author Matrix
 */
public class EJ11 {

    public static void factorial(int numero) {
        /**
         * este metodo calcula el factorial de un numero ingresado como
         * parametro numero: es el numero a calcular su factorial
         */
        int acum, i;
        acum = 1;
        if (numero == 0) {
            System.out.println(numero + "! = 1");

        } else if (numero > 0) {
            for (i = 1; i <= numero; i++) {
                acum = acum * i;

            }
            System.out.println(numero + "! = " + acum);

        } else {
            System.out.println(numero + " es un n° negativo; NO se puede calcular su factorial.");

        }
    }

    public static void main(String[] args) {
        //Este algoritmo se usa para invocar al modulo factorial
        int num;
        System.out.println("Ingrese el numero entero positivo que desea calcular su factorial");
        num = TecladoIn.readLineInt();
        factorial(num);

    }

}
