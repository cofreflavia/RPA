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
public class EJ7b 
{
    public static void main (String []arg)
    {
        int x,y,z;
        System.out.println("Ingrese dos valores enteros");
        x=TecladoIn.readLineInt();
        y=TecladoIn.readLineInt();
        z=y;
        y=x;
        x=z;
        System.out.println("El nuevo valor de x es "+x);
        System.out.println("El nuevo valor de y es "+y);
    }
}
    
