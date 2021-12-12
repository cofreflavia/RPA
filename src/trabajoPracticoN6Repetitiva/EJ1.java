/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN6Repetitiva;

/**
 *
 * @author Matrix
 */
public class EJ1 {

    public static void main(String[] args) {
        //
        int contador, resultado;
        contador = 0;
        resultado = 0;
        while (contador <10) {
            resultado = contador + resultado;
            contador = contador + 1;
        }
        System.out.println("El resultador es " + resultado);
    }

}
