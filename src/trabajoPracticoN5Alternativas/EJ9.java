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
public class EJ9 {

    public static void main(String[] args) {
        //Este algoritmo permite saber si el numero ingresado es mayor, menor o igual a cero
        double num;
        System.out.println("Ingrese el numero:");
        num = TecladoIn.readLineDouble();
        if (num >= 0) {
            if (num > 0) {
                System.out.println("El numero " + num + " es positivo");
            } else {
                System.out.println("El numero " + num + " es el cero");
            }
        } else {
            System.out.println("El numero " + num + " es negativo");
        }
    }
}
