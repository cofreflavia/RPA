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
public class EJ2iiii {

    public static void main(String[] args) {
        //
        int resultado, hastaNum, contador, acum;
        acum = 0;
        System.out.println("Ingrese el numero hasta el cual quiere realizar la suma de los numeros:");
        hastaNum = TecladoIn.readLineInt();
        for (contador = 1; contador<=hastaNum / 2; contador++) {
            resultado = contador * 2;
            System.out.print(resultado+"+");
            acum = resultado + acum;
        }
        System.out.print("=" + acum);
    }
}
