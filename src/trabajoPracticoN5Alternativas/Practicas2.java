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
public class Practicas2 {
    public static double calcular (double op1, double op2, char operacion){
    double res;
    res=0;
    switch (operacion){
        case '+':res= op1+op2;break;
        case '-':res= op1-op2;break;
        case '/':res= op1/op2;break;
        case '*':res= op1*op2;break;           
    }
    return res;
    }
    public static void main (String[]args){
    double ope1, ope2;
    char operacion;
    System.out.println("Ingrese el primer operando:");
    ope1=TecladoIn.readLineDouble();
    System.out.println("Ingrese el segundo operando:");
    ope2=TecladoIn.readLineDouble();
    System.out.println("Ingrese la operacion");
    operacion=TecladoIn.readLineNonwhiteChar();
    System.out.println("El resultado es: "+calcular(ope1,ope2,operacion));
    }
    
}
