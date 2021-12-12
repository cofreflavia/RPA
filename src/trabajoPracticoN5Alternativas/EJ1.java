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
public class EJ1 {

    public static void main(String[] args) {
        //Indica si el numero ingresado por el usuario es impar
        int num;
        System.out.println("Ingrese el numero entero");
        num = TecladoIn.readLineInt();
        if (num % 2 != 0) {
            System.out.println(num+" es un numero impar");
        }

    }

}
