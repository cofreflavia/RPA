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
public class EJ2ii {

    public static void main(String[] args) {
        //
        int contador, resultado, num;
        contador = 1;
        resultado = 1;
        System.out.println("¿Hasta que numero nautural quiere realizar el producto?");
        num = TecladoIn.readLineInt();
        while (contador <= num) {
            resultado = contador * resultado;
            contador = contador + 1;
        }
        System.out.println("El resultador es " + resultado);
    }
}
