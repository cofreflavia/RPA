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
public class EJ4 {

    public static void main(String[] args) {
        /*Este algoritmo indica si los numeros ingresados estan ordenados de manera
         decreciente*/
        double n, m;
        System.out.println("Ingrese dos numeros");
        n = TecladoIn.readLineDouble();
        m = TecladoIn.readLineDouble();
        if (n < m) {
            System.out.println("Los numeros " + n + " y " + m + " estan ordenados en forma decreciente");
        } else {
            System.out.println("Los numeros " + n + " y " + m + " NO estan ordenados en forma decreciente");
        }
    }

}
