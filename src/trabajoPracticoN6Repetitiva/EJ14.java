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
public class EJ14 {

    public static void main(String[] args) {
        /*Muestra cuantos de los numeros ingresados son multiplos de otro numero ingresado, invocando un metodo para conocer si es multiplo*/
        int x, cantNum, i, acum, num;
        acum = 0;
        System.out.println("Ingrese el numero 'X':");
        x = TecladoIn.readLineInt();
        System.out.println("Ingrese la cantidad de numeros que quiere saber si es multiplo de " + x);
        cantNum = TecladoIn.readLineInt();
        for (i = 0; i < cantNum; i++) {
            System.out.println("Ingrese el numero entero que quiere saber si es multiplo de " + x);
            num = TecladoIn.readLineInt();
            acum = acum + esMultiplo(x, num);

        }
        System.out.println(acum + " de los " + cantNum + " numeros ingresados son multiplos de " + x);

    }

    public static int esMultiplo(int x1, int num1) {
        /**
         *
         */
        if (num1 % x1 == 0) {
            return (1);

        } else {
            return (0);
        }
    }

}
