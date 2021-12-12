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
public class EJ2 {

    public static void main(String[] args) {
        //Este algoritmo calcula, si el numero ingresado es positivo el sucesor y si es negativo su antecesor
        int num;
        System.out.println("Ingrese un numero entero (distinto de cero)");
        num = TecladoIn.readLineInt();
        if (num > 0) {
            num++;
        } else {
            num--;
        }
        System.out.println(num);
    }

}
