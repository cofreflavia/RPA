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
public class EJ3 {

    public static void main(String[] args) {
        /*Este algoritmo verfica si el numero ingresado es multiplo de 7,
         sino lo es, no muestra nada*/
        int num;
        System.out.println("Ingrese un numero entero:");
        num = TecladoIn.readLineInt();
        if (num % 7 == 0) {
            System.out.println(num + " si es multiplo de 7");
        }
    }

}
