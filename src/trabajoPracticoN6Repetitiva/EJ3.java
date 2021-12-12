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
public class EJ3 {
    public static void main (String []args){
        //Este algoritmo arroja el promedio de los sueldos de los empleados
        int cantEmpl, empleado;
        double sueldo, acumSueldo;
        System.out.println("Ingrese la cantidad de empleados que tiene la empresa:");
        cantEmpl=TecladoIn.readLineInt();
        empleado=1;
        acumSueldo=0;
        while (empleado<=cantEmpl){
            System.out.println("Ingrese el sueldo del empleado numero"+empleado);
            sueldo=TecladoIn.readLineDouble();
            acumSueldo=acumSueldo+sueldo;
            empleado=(empleado+1);
        }
        System.out.println("El promedio de los sueldos de los empleados es: "+promedioSueldo(cantEmpl, acumSueldo));
    }
    public static double promedioSueldo(int cantEmpleados, double totalSueldos){
        /**Este metodo hace una division obteniendo el promedio de los sueldos de los empleados
         * cantEmpleados: es la cantidad de empleados de la empresa
         * totalSueldos: es la suma de todos los sueldos de cada empleado
        */
        return totalSueldos/cantEmpleados;
    }


}
