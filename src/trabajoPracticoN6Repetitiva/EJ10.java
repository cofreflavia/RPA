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
public class EJ10 {

    public static void main(String[] args) {
        //Este algoritmo muestra cuantas de las palabras ingresadas tienen 3 o menos letras
        String palabra;
        int acum = 0;

        do {
            System.out.println("Ingrese una palabra ");
            palabra = TecladoIn.readLine();
            if (palabra.length() <= 3) {
                acum++;
                System.out.println("La palabra " + palabra + " contiene 3 letras o menos");

            } else {
                System.out.println("La palabra " + palabra + " contiene mas de 3 letras");

            }

        } while (!(palabra.equalsIgnoreCase(" ")));
        System.out.println("Hay " + (acum - 1) + " palabras que tienen 3 letras o menos");

    }

}
