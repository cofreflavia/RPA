/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN5Alternativas;

import utiles.TecladoIn;
import utiles.matematica;

/**
 *
 * @author Matrix
 */
public class EJ11 {

    public static void main(String[] args) {
        //Este algoritmo permite ingresar un numero y devuelve su valor absoluto
        double num1;
        System.out.println("Ingrese un numero");
        num1 = TecladoIn.readLineDouble();
        System.out.println("El valor absoluto de " + num1 + " es " + matematica.valorAbs(num1));
    }

}
