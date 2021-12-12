/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoPracticoN4Modularizacion;

import utiles.CalculosDeGeometria;
import utiles.TecladoIn;

/**
 *
 * @author Matrix
 */
public class EJ7 {

    public static void main(String[] args) {
        double bas, alt;
        System.out.println("Ingrese la base y la altura de un rectangulo en ese orden");
        bas = TecladoIn.readLineDouble();
        alt = TecladoIn.readLineDouble();
        System.out.println("El perimetro del rectangulo es de: " + CalculosDeGeometria.perimetroRectangulo(bas, alt));
        System.out.println("El area del rectangulo es de: " + CalculosDeGeometria.areaRectangulo(bas, alt));
    }

}
