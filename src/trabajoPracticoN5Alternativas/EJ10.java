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
public class EJ10 {

    public static void main(String[] args) {
        /*Este algoritmo indica el tipo de alimentacion de un animal segun lo
         que come*/
        char car, herbi;
        System.out.println("¿El animal come carne (S/N)?");
        car = TecladoIn.readLineNonwhiteChar();
        car = Character.toUpperCase(car);
        System.out.println("¿El animal come vegetales (S/N)?");
        herbi = TecladoIn.readLineNonwhiteChar();
        herbi = Character.toUpperCase(herbi);
        if (car == 'S' && herbi == 'S') {
            System.out.println("Se trata de un animal omnivoro");
        } else {
            if (car == 'S' && herbi == 'S') {
                System.out.println("Se trata de un animal carnivoro");
            } else {
                System.out.println("Se trata de un animal herbivoro");
            }
        }

    }

}
