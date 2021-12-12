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
public class Practicas3 {

    public static double porcentaje(int porcentaje, double valorTotal) {
        double res;
        res = porcentaje * valorTotal / 100;
        return res;
    }

    public static double calcularDto(boolean esAlumno, char genero, double valorPrenda) {
        double res;
        if (esAlumno) {
            if (genero == 'H') {
                res = valorPrenda - porcentaje(20, valorPrenda);
            } else {
                res = valorPrenda - porcentaje(25, valorPrenda);
            }
        } else {
            res = valorPrenda - porcentaje(10, valorPrenda);
        }
        return res;
    }

    public static void main(String[] args) {
        boolean esAlumno;
        char genero;
        double valorPrenda;
        System.out.println("Ingrese el valor de la prenda");
        valorPrenda = TecladoIn.readLineDouble();
        System.out.println("Ingrese si es alumno (true/false)");
        esAlumno = TecladoIn.readLineBoolean();
        System.out.println("Ingrese el genero (H/M)");
        genero = TecladoIn.readLineNonwhiteChar();
        System.out.println("El valor para esa persona es de: $" + calcularDto(esAlumno, genero, valorPrenda));
    }
}
