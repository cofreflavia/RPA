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
public class EJ9 {

    public static void main(String[] args) {
        //Este algoritmo lee letras e indica si dichas letras son vocales o no a traves de la invocacion a un modulo
        char let;
       do {
            System.out.println("Ingrese la letra");
            let = TecladoIn.readLineNonwhiteChar();
            esVocal(let);
        } while (let !='.');

    }

    public static void esVocal(char letra) {
        //Este metodo indica si la letra ingresada como parametro es vocal o no 
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("La letra " + letra + " es una vocal");

        } else {
            System.out.println("La letra " + letra + " no es una vocal");

        }

    }

}
