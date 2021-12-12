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
public class EJ6 {

    public static void main(String[] args) {
        /*Calcula el resto de dos numeros positivos e imprime y si uno o ambos
         son negativos imprime el cero*/
        double a, b, r;
        System.out.println("Ingrese dos numeros");
        a = TecladoIn.readLineDouble();
        b = TecladoIn.readLineDouble();
        r = 0;
        if ((a > 0) && (b > 0)) {
            r = (a % b);
        }
        System.out.println(r);
    }

}
