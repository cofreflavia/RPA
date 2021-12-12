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
public class EJ8 {

    public static void main(String[] args) {
        double num, cantNum, i;
        System.out.println("Ingrese la cantidad de numeros la cual desea conocer si es cero, positivo o negativo");
        cantNum = TecladoIn.readLineDouble();
        for (i = 1; i <= cantNum; i++) {
            System.out.println("Ingrese el numero:");
            num = TecladoIn.readLineDouble();
            if (num == 0) {
                System.out.println("Se trata del cero");
            } else {
                if (num > 0) {
                    System.out.println("Se trata de un numero positivo");

                } else {
                    System.out.println("Se trata de un numero negativo");

                }
            }

        }

    }
}
