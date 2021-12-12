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
public class EJ5 {

    public static void main(String[] args) {
        //Este algoritmo muestra el cuadrado del numero ingresado hasta que se ingresa el -1
        int num;
        System.out.println("Ingrese un numero natural:");
        num = TecladoIn.readLineInt();
        while (num !=-1) {
            System.out.println("El cuadrado de " + num + " es " + (num * num));
            System.out.println("Ingrese un nuevo numero natural:");
            num = TecladoIn.readLineInt();

        }
    }

}
