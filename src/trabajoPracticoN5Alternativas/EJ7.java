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
public class EJ7 {

    public static void main(String[] args) {
        //Este algoritmo indica el numero menor de los dos ingresados por el usuario
        double n, m;
        System.out.println("Ingrese el primer numero:");
        n = TecladoIn.readLineDouble();
        System.out.println("Ingrese el segundo numero:");
        m = TecladoIn.readLineDouble();
        if (n == m) {
            System.out.println("los numeros ingresados son iguales, " + n + "=" + m);
        } else {
            if (n < m) {
                System.out.println("el menor de los numeros ingresados es: " + n);
            } else {
                System.out.println("El menor de los numeros ingresados es: " + m);
            }
        }
    }
}
