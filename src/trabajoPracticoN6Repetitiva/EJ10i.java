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
public class EJ10i {

    public static void main(String[] args) {
        /*Este algoritmo muestra si la palabra ingresada contiene 3 o menos letras y la cantidad de palabras que se ingresaron que contiene 3 o menos letras.

         */
        String palabra;
        int acum = 0;
        palabra = "palabra";
        while (!(palabra.equalsIgnoreCase(" "))) {
            System.out.println("Ingrese la palabra ");
            palabra = TecladoIn.readLine();
            if (palabra.length() <= 3) {
                acum++;
                System.out.println("La palabra " + palabra + " contiene 3 letras o menos");

            }
        }
        System.out.println("Hay " + (acum - 1) + " palabras que tienen 3 letras o menos");

    }

}
