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
public class EJ5nopedido {
    public static void main (String []args){
        //
        int num, cantNum, cant;
        System.out.println("Ingrese la cantidad de numeros que desea saber su cuadrado.");
        cantNum=TecladoIn.readLineInt();
        cant=0;
        while (cant<cantNum){
            System.out.println("Ingrese un numero natural");
            num=TecladoIn.readLineInt();
            if (num>0){
                 System.out.println(num+"^2="+num*num);
            }else{
                 System.out.println("El numero ingresado no es natural");
            }
            cant=cant+1;
        }
    }
    
}
