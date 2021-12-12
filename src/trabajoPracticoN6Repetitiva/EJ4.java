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
public class EJ4 {

    public static void main(String[] args) {
        //Este algoritmo calcula el antecesor y el sucesor del numero ingresado
        int  num, sucesor, antecesor, cantNum, acum;
        System.out.println("¿A cuantos numeros quiere encontrar su sucesor y antecesor?");
        cantNum = TecladoIn.readLineInt();
        acum = 0;
        while (acum < cantNum) {
            System.out.println("Ingrese el numero deseado:");
            num = TecladoIn.readLineInt();
            sucesor = num + 1;
            antecesor = num - 1;
            System.out.println("El numero " + num + " tiene como antecesor el " + antecesor + " y como sucesor el " + sucesor);
            acum = acum + 1;
        }

    }

}
