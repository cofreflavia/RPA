/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN4Modularizacion;

import utiles.TecladoIn;

/**
 *
 * @author Matrix
 */
public class ejeClase {

    public static void main(String[] args) {
        int nro;
        System.out.print("Ingrese un numero entero entero:");
        nro = TecladoIn.readLineInt();
        boolean respuesta;
        respuesta = par(nro);
        System.out.println("El numero leido es par: " + respuesta);
    }

    public static boolean par(int numero) {
        boolean resultado;
        resultado = ((numero % 2) == 0);
        return resultado;
    }
}
