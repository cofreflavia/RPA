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
public class EJ8 {

    public static void main(String[] args) {
        //Este algoritmo indica si el usuario puede recibir la beca del comedor
        double promedio, distancia;
        int edad;
        System.out.println("Ingrese su edad:");
        edad = TecladoIn.readLineInt();
        System.out.println("Ingrese el promedio de sus notas:");
        promedio = TecladoIn.readLineDouble();
        System.out.println("Ingrese la distancia (en km) a la que se encuentra de la ciudad de Neuquen:");
        distancia = TecladoIn.readLineDouble();
        if (((promedio > 7) && (edad < 25)) || (distancia > 30)) {
            System.out.println("Usted puede acceder a la beca comedor");
        } else {
            System.out.println("Usted NO puede acceder a la beca comedor");
        }
    }
}
