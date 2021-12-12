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
public class EJ6a 
{
    public static void main (String [] arg)
    {
        double nota1,nota2,nota3,nota4,nota5,promedioNotas;
        System.out.println("Ingrese los valores de las 5 notas, una por una, presionando Enter.");
    nota1=TecladoIn.readLineDouble();
    nota2=TecladoIn.readLineDouble();
    nota3=TecladoIn.readLineDouble();
    nota4=TecladoIn.readLineDouble();
    nota5=TecladoIn.readLineDouble();
    promedioNotas=((nota1+nota2+nota3+nota4+nota5)/5);
    System.out.println("El promedio de las 5 notas es:"+promedioNotas);
    }
}
    