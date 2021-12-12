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
public class EJ2g {
    public static void piramide7(int n){
        int fila, col;
        for(fila=1;fila<=n;fila++){
            
            for(col=fila+1;col<=((2*n)-fila+1);col=col+2){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int cantFilas;
        System.out.println("Ingrese la cantidad de filas de su triangulo");
        cantFilas=TecladoIn.readLineInt();
        System.out.println();
        piramide7(cantFilas);
    }
}
