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
public class EJ5 {

    public static void main(String[] args) {
        //Pide al usuario las horas, minutos y segundos y muestra el valor en segundos
        int hora, minutos, segundos;
        System.out.println("Ingrese la hora, luego los minutos y finalmente los segundos en ese orden:");
        hora = TecladoIn.readLineInt();
        minutos = TecladoIn.readLineInt();
        segundos = TecladoIn.readLineInt();
        System.out.println(hora + ":" + minutos + ":" + segundos + " representan: " + transforSegundos(hora, minutos, segundos) + " segundos");
    }

    public static int transforSegundos(int hor, int min, int seg) {
        /**Transforma las horas, minutos y segundos ingresados por el usuario y los convierte en segundos.
         * hor: son las horas.
         * min: son los minutos.
         * seg: son los segundos
         */
        return (hor * 3600) + (min * 60) + seg;
    }
}
