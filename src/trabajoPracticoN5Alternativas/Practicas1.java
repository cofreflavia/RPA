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
public class Practicas1 {

    public static void main(String[] args) {
        /*Este algoritmo verifica si los angulos ingresados corresponden a un
         trinagulo rectangulo*/
        int angu1, angu2, angu3;
        System.out.println("Ingrese el primer angulo del triangulo");
        angu1 = TecladoIn.readLineInt();
        System.out.println("Ingrese el segundo angulo del triangulo");
        angu2 = TecladoIn.readLineInt();
        System.out.println("Ingrese el tercer angulo del triangulo");
        angu3 = TecladoIn.readLineInt();
        System.out.println(esTriangRec(angu1, angu2, angu3));
    }

    public static boolean esTriangRec(int ang1, int ang2, int ang3) {
        /**
         * Este metodo verifica si los angulos recibidos pertenecen a un
         * triangulo rectangulo ang1: primer angulo del triangulo ang2: segundo
         * angulo del triangulo ang3: tercer angulo del triangulo
         */
        int sumaAngulos;
        boolean esTriangulo;
        sumaAngulos = ang1 + ang2 + ang3;
        if ((sumaAngulos == 180) && (ang1 == 90 || ang2 == 90 || ang3 == 90)) {
            esTriangulo = ((sumaAngulos == 180) && (ang1 == 90 || ang2 == 90 || ang3 == 90));
        } else {
            esTriangulo = ((sumaAngulos == 180) && (ang1 == 90 || ang2 == 90 || ang3 == 90));
        }
        return esTriangulo;
    }
}
