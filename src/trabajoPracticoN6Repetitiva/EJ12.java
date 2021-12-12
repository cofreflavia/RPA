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
public class EJ12 {

    public static void main(String[] args) {
        double valor, acum = 0;
        String rubro, seguir;
        seguir = "SI";
        while (seguir.equalsIgnoreCase("SI")) {
            System.out.println("¿El producto es del rubro perfumeria SI/NO?");
            rubro = TecladoIn.readLine();
            System.out.println("Ingrese el precio del producto:");
            valor = TecladoIn.readLineDouble();
            acum = acum + descuento(rubro, valor);
            System.out.println("¿Desea continuar ingresando productos SI/NO?");
            seguir = TecladoIn.readLine();

        }
        System.out.println("El total a pagar con los descuentos aplicados es de: $" + acum);

    }

    public static double descuento(String perfumeria, double precio) {
        double elDescuento;
        if (perfumeria.equalsIgnoreCase("SI")) {
            elDescuento = 80 * precio / 100;
        } else {
            elDescuento = precio;
        }
        return (elDescuento);
    }

}
