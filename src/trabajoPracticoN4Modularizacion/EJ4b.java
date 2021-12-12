/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN4Modularizacion;

import utiles.TecladoIn;

/**
 *
 * @author Matrix
 */
public class EJ4b {

    public static void main(String[] args) {
        //Muestra la temperatura de grados Fahrenheit a grados Celsius
        double fahrenheit;
        System.out.print("Ingrese la temperatura en grados Fahrenheit:");
        fahrenheit = TecladoIn.readLineDouble();
        System.out.println(fahrenheit + " grados Fahrenheit representan " + deFahACelsius(fahrenheit) + " grados Celsius");
    }

    public static double deFahACelsius(double graFah) {
        /**Transforma la temperatura de grados Fahrenheit a grados Celsius
         * graFah: grados en Fahrenheit
         */
        return 5 * (graFah - 32) / 9;
    }
}
