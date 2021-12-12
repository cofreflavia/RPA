/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulcroParcial;

import utiles.TecladoIn;

/**
 *
 * @author Matrix
 */
public class EJ2j {
    public static void main(String[] args) {
        /*Este metodo pide el ingreso de las cantidad de filas para invocar un metodo el cual imprime un triangulo*/
        int cantFilas;
        System.out.println("Ingrese la cantidad de filas para el tringulo:");
        cantFilas = TecladoIn.readLineInt();
        System.out.println();
        piramide10(cantFilas);
    }
    public static void piramide10 (int n){
        int fila, col, acum;
        for (fila=1;fila<=n;fila++){
            acum=fila;
            for(col=acum;col>=1;col=col-1){
                System.out.print(col);
            }
                            System.out.println();

        }
    }
    
}
