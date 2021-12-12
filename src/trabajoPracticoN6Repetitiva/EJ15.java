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
public class EJ15 {

    public static void main(String[] args) {
        String palabra, oracion;
        oracion = "";
        do {
            System.out.println("Ingrese una palabra");
            palabra = TecladoIn.readLine();
            oracion = (oracion + " " + palabra);
        } while (!(palabra.equals(".")));
        System.out.println(oracion);
    }
    
}
