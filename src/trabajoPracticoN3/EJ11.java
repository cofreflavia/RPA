/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN3;

import utiles.TecladoIn;

/**
 *
 * @author Matrix
 */
public class EJ11 {

    public static void main(String[] arg) {
//El algoritmo calcula el lado PX para cualquier rectangulo y cuadrado
        double ladoCuadrado, ladoRectangulo1, ladoRectangulo2, areaCuadrado, areaRectangulo, areaSombreada, areaNoSombreada, ladoIncognita;
        System.out.println("Ingrese el lado del cuadrado");
        ladoCuadrado = TecladoIn.readLineDouble();
        System.out.println("Ingrese el lado mayor del rectangulo");
        ladoRectangulo1 = TecladoIn.readLineDouble();
        System.out.println("Ingrese el lado menor de rectangulo");
        ladoRectangulo2 = TecladoIn.readLineDouble();
        areaCuadrado = ladoCuadrado * ladoCuadrado;
        areaRectangulo = ladoRectangulo1 * ladoRectangulo2;
        areaSombreada = areaRectangulo / 2;
        areaNoSombreada = areaCuadrado - areaSombreada;
        ladoIncognita = areaNoSombreada / ladoCuadrado;
        System.out.println("El lado PX mide:" + ladoIncognita);
    }

}
