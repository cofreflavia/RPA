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
public class EJ2iii {

    public static void main(String[] args) {
        //
        int contador, resultado, num;
        contador = 0;
        resultado = 0;
        while (contador < 10) {
            System.out.println("Ingrese el numero que quiere sumar");
            num = TecladoIn.readLineInt();
            resultado = num + resultado;
            contador = contador + 1;
        }
        System.out.println("El resultador es " + resultado);
    }
}
