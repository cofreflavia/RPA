/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN5Alternativas;

import utiles.TecladoIn;

/**
 *
 * @author Matrix
 */
public class EJ6d {

    public static void main(String[] args) {
        /*Calcula el resto de dos numeros positivos e imprime y si uno o ambos
         son negativos imprime el cero*/
        double a, b, r;
        System.out.println("Ingrese dos numeros");
        a = TecladoIn.readLineDouble();
        b = TecladoIn.readLineDouble();
        r = restoDivision(a, b);
        System.out.println(r);
    }

    public static double restoDivision(double num1, double num2) {
        /**
         * Este metodo calcula el resto de dos numeros positivos num1: es el
         * primer numero ingresado num2: es el segundo numero ingresado
         */
        if ((num1 > 0) && (num2 > 0)) {
            return (num1 % num2);
        } else {
            return 0;
        }
    }
}
