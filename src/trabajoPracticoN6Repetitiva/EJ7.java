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
public class EJ7 {

    public static void main(String[] args) {
        //
        int dia, cantDias;
        double temp, acum, prom;
        System.out.println("Ingrese la cantidad de dias");
        cantDias = TecladoIn.readLineInt();
        dia = 1;
        acum = 0;
        while (dia <= cantDias) {
            System.out.println("Ingrese la temperatura del dia" + dia);
            temp = TecladoIn.readLineDouble();
            acum = temp + acum;
            dia = dia + 1;
        }
        prom = acum / cantDias;
        System.out.println("El promedio de las temperaturas registradas en los " + cantDias + " dias es de " + prom);
    }

}
