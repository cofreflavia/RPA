/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

/**
 *
 * @author Matrix
 */
public class matematica {

    public static double valorAbs(double numero) {
        //Este metodo calcula el valor absoluto de un numero
        double numAbs;
        if (numero < 0) {
            numAbs = numero * -1;
        } else {
            numAbs = numero;
        }
        return numAbs;
    }

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
}
