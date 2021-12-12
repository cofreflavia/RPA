/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoFinal;

import utiles.TecladoIn;

/**
 *
 * @author chidi
 */
public class TelefonoParaTodos {

    public static boolean caracteristicaTelefono(String palabra) {
        /**Este metodo va a tener en cuenta solo las caracteristicas:
        Neuquen(0299)/Roca(0298)/Bariloche(0294)/Mendoza(0261)/BahiaBlanca(0291).
        * palabra: es el numero de telefono ingresado como parametro.
         */
        boolean res = false;

        String palabra1 = palabra.substring(0, 4);

        if ((palabra.indexOf('-') == 4) && (palabra1.equals("0299") || palabra1.equals("0298") || palabra1.equals("0261") || palabra1.equals("0291") || palabra1.equals("0294"))) {

            res = true;
        }

        return res;
    }

    public static boolean numeroTelefono(String palabra) {
        /**Este metodo verifica si el numero ingresado es correcto retornando true o false segun corresponda.
         * palabra: es el numero de telefono ingresado como parametro.
         */
        boolean acum = false;
        String palabra1 = palabra.substring(5);
        int i = 2;
        if (caracteristicaTelefono(palabra)) {
            if (palabra1.length() == 9) {
                acum = false;
                if (palabra1.charAt(0) == '1' && palabra1.charAt(1) == '5') {
                    acum = true;
                    while (i >= 2 && i < 9 && acum) {
                        if (palabra1.charAt(i) == '0' || palabra1.charAt(i) == '1' || palabra1.charAt(i) == '2' || palabra1.charAt(i) == '3' || palabra1.charAt(i) == '4' || palabra1.charAt(i) == '5' || palabra1.charAt(i) == '6' || palabra1.charAt(i) == '7' || palabra1.charAt(i) == '8' || palabra1.charAt(i) == '9') {
                            i++;
                        } else {
                            acum = false;

                        }

                    }
                }
                
            } 
        }

        return acum;

    }

    public static String errorNumero(String palabra) {
        /**Este metodo retorna el primer error encontrado, que tiene el numero de telefono ingresado como parametro.
         * palabra: es el numero de telefono ingresado como parametro.
         */
        String palabra1, palabra2, cartel = "";
        int num, i = 2;
        palabra1 = palabra.substring(0, 4);
        palabra2 = palabra.substring(5);
        num = palabra2.length();
        boolean acum = true;
        if (palabra.indexOf('-') != 4) {
            cartel = "Se olvido de poner el guion o la caracteristica tiene mas de 4 numeros";

        } else {
            if (!palabra1.equals("0299") && !palabra1.equals("0298") && !palabra1.equals("0261") && !palabra1.equals("0291") && !palabra1.equals("0294")) {
                cartel = "La caracteristica no es valida";
            } else {

                if (num > 9) {
                    cartel = "El numero es muy largo";
                } else {
                    if (num < 9) {
                        cartel = "El numero es muy corto";
                    } else {
                        if ((palabra2.charAt(0) != '1') || (palabra2.charAt(1) != '5')) {
                            cartel = "El numero no inicia con el numero \"15\"";
                        } else {
                            while (i >= 2 && i < 9 && acum) {
                                if (palabra2.charAt(i) == '0' || palabra2.charAt(i) == '1' || palabra2.charAt(i) == '2' || palabra2.charAt(i) == '3' || palabra2.charAt(i) == '4' || palabra2.charAt(i) == '5' || palabra2.charAt(i) == '6' || palabra2.charAt(i) == '7' || palabra2.charAt(i) == '8' || palabra2.charAt(i) == '9') {
                                    i++;
                                } else {
                                    acum = false;
                                    cartel = "El numero contiene un caracter incorrecto o una letra";

                                }

                            }
                            if (acum) {
                                cartel = ("Numero de telefono valido :D");
                            }
                        }
                    }
                }
            }
        }

        return cartel;
    }

    public static boolean modulo3(String telefono1, String telefono2) {
        /**Este metodo verifica si el primer numero es menor que el segundo numero, retornando true o false segun corresponda.
         * telefono1: primer numero de telefono ingresados como parametro.
         * telefono2: segundo numero de telefono ingresado como parametro.
         */
        boolean res = false;
        if (Integer.parseInt(telefono1.substring(5)) < Integer.parseInt(telefono2.substring(5))) {
            res = true;
        }
        return (res);
    }

    public static boolean modulo4(String telefono1, String telefono2) {
        /**Este metodo verifica si el primer numero es igual al segundo numero.
         * telefono1: primer numero de telefono ingresados como parametro.
         * telefono2: segundo numero de telefono ingresado como parametro.
         */
        boolean res = false;
        if (Integer.parseInt(telefono1.substring(5)) == Integer.parseInt(telefono2.substring(5))) {
            res = true;
        }
        return res;
    }

    public static void modulo5() {
        /*Este metodo muestra el numero mas grande de una secuencia de numeros de telefono ingresados por el usuario.
         ESTE METODO NO TIENE EN CUENTA LA CARACTERSISTICA PARA DETERMINAR EL NUMERO MAS GRANDE DE LA SECUENCIA
         Recuerde: el formato de numero de telefono es CCCC-NNNNNNNNN
         */
        String telefono, telefono1, seguir = "si";
        boolean acum = true;
        System.out.println("AVISO: PARA DETERMINAR EL NUMERO MAS GRANDE NO SE TIENE EN CUENTA LA CARACTERISTICA Y ADEMAS SI SE INGRESA MAL UN NUMERO FINALIZA EL INGRESO DE TELEFONOS");
        System.out.println("Ingrese un numero de telefono con un - despues de la caracteristica:");
        telefono = TecladoIn.readLine();
        if (numeroTelefono(telefono) == false) {
            System.out.println(errorNumero(telefono));
        } else {
            while (seguir.equalsIgnoreCase("si") && acum) {
                System.out.println("Ingrese un nuevo numero de telefono con un - despues de la caracteristica");
                telefono1 = TecladoIn.readLine();
                if (numeroTelefono(telefono1)==false) {
                    System.out.println(errorNumero(telefono1));
                    acum = false;
                } else {
                    if (modulo3(telefono, telefono1) || modulo4(telefono, telefono1)) {
                        telefono = telefono1;
                    }
                    System.out.println("¿Desea continuar (si/no)?");
                    seguir = TecladoIn.readLine();

                }
            }
            System.out.println("De los numeros ingresados correctamente el mayor es el: " + telefono);

        }
        
    }

    public static void modulo6() {
        /*Este metodo pide al usuario que ingrese un telefono determinado y luego una secuencia de telefonos.
         Muestra por pantalla cuantas veces se encuentra duplicado ese numero determinado en la secuencia ingresada.
         Recuerde: el formato de numero de telefono es CCCC-NNNNNNNNN
        */
        String A, seguir, telefono;
        boolean acumu = true;
        seguir = "si";
        int acum = 0;
        System.out.println("AVISO: PARA ENCONTRAR OCURRENCIA SE TIENE EN CUENTA EL NUMERO DE TELEFONO CON LA CARACTERISTICA");
        System.out.println("Ingrese el numero de telefono determinado \"A\" con un - despues de la caracteristica");
        A = TecladoIn.readLine();
        if (!numeroTelefono(A)) {
            System.out.println(errorNumero(A));
        } else {
            while (seguir.equalsIgnoreCase("si") && acumu) {
                System.out.println("Ingrese un numero de telefono con un - despues de la caracteristica");
                telefono = TecladoIn.readLine();
                if (!numeroTelefono(telefono)) {
                    System.out.println(errorNumero(telefono));
                    acumu = false;
                } else {
                    if (A.equals(telefono)) {
                        acum++;
                    }
                    System.out.println("¿Desea continuar (si/no)?");
                    seguir = TecladoIn.readLine();
                }
            }
            if (acum > 0) {
                System.out.println("El numero de telefono " + A + " esta duplicado " + acum + " veces en la secuencia ingresada");
            } else {
                System.out.println("El numero de telefono " + A + " no se encuentra dublicado en la secuencia ingresada");
            }

        }
    }

    public static int modulo7(String palabra) {
        /**Este metodo recibe un telefono como parametro lo incrementa una unidad y lo retorna.
         * palabra: es el numero de telefono ingresado como parametro.
         */
        
        palabra = palabra.substring(5);
        int a = Integer.parseInt(palabra);
        a++;
        return a;

    }

    public static void modulo8(String palabra) {
        /**Este metodo recibe una secuencia de numeros e imprime por pantalla el numero mas grande que se encuntra en la misma.
         * palabra: es una secuencia de telefono ingresada como parametro.
         */
        int posIni = 0, posFin = 14, acum, a = palabra.length();
        boolean sigue = true;
        String pal;
        while (posFin <= a && sigue) {
            pal = palabra.substring(posIni, posFin);
            sigue = numeroTelefono(pal);
            if (!sigue) {
                System.out.println(pal + " " + errorNumero(pal));
            }
            posFin += 15;
            posIni += 15;
        }
        if (sigue) {
            posIni = 5;
            posFin = 14;
            int acumu = 0, numero = 0;
            while (posFin <= a) {
                pal = palabra.substring(posIni, posFin);
                numero = Integer.parseInt(pal);
                if (acumu < numero) {
                    acumu = numero;
                }
                posIni += 15;
                posFin += 15;
            }
            System.out.println("El numero mas grande es:" + acumu);
        }
    }

    public static void modulo9(String palabra) {
        /**Este metodo encuentra la ocurrencia que existe entre un numero pedido por el usuario y una secuencia de telefono ingresada como parametro.
         * palabra: es una secuencia de numeros de telefono ingresado como parametro.
           Recuerde: el formato de numero de telefono es CCCC-NNNNNNNN.
         */
        int posIni = 0, posFin = 14, acum, a = palabra.length();
        boolean sigue = true;
        String pal, palabra1;
        System.out.println("Ingrese el numero de telefono que quiere comparar con un - luego de la caracteristica");
        palabra1 = TecladoIn.readLine();
        if (!numeroTelefono(palabra1)) {
            System.out.println(errorNumero(palabra1));
        } else {
            while (posFin <= a && sigue) {
                pal = palabra.substring(posIni, posFin);
                sigue = numeroTelefono(pal);
                if (!sigue) {
                    System.out.println(pal + " " + errorNumero(pal));
                }
                posFin += 15;
                posIni += 15;
            }
            if (sigue) {
                posIni = 0;
                posFin = 14;
                int acumu = 0;
                while (posFin <= a) {
                    pal = palabra.substring(posIni, posFin);
                    if (pal.equalsIgnoreCase(palabra1)) {
                        acumu++;
                    }
                    posIni += 15;
                    posFin += 15;
                }
                if (acumu > 0) {
                    System.out.println("El numero: " + palabra1 + " tiene: " + acumu + " ocurrencias");
                } else {
                    System.out.println("El numero: " + palabra1 + " no tiene ocurrencias");
                }
            }
        }
    }

    public static void modulo10(int modulo) {
        /**Este metodo permite seleccionar un caso segun el numero ingresado como parametro y llama al modulo correspondiente.
         * modulo: es un un nuemero ingresado como parametro.
         */
        switch (modulo) {
            case 1:
                System.out.println("Ingrese un numero con la caracteristica seguida por un - y el numero");
                //Recuerde: el formato de numero de telefono es CCCC-NNNNNNNN.      
                String palabra = TecladoIn.readLine();
                System.out.println("El numero es valido: " + numeroTelefono(palabra));break;
            case 2:
                System.out.println("Ingrese un numero con la caracteristica seguida por un - y el numero");
                //Recuerde: el formato de numero de telefono es CCCC-NNNNNNNN.
                String palabra1 = TecladoIn.readLine();
                System.out.println(errorNumero(palabra1));break;
            case 3:
                System.out.println("Ingrese un numero con la caracteristica seguida por un - y el numero");
                //Recuerde: el formato de numero de telefono es CCCC-NNNNNNNN
                String palabra2 = TecladoIn.readLine();
                System.out.println("Ingrese otro numero con la caracteristica seguida por un - y el numero");
                //Recuerde: el formato de numero de telefono es CCCC-NNNNNNNN.
                String palabra3 = TecladoIn.readLine();
                if (numeroTelefono(palabra2) == false) {
                    errorNumero(palabra2);
                } else {
                    if (numeroTelefono(palabra3) == false) {
                        errorNumero(palabra3);
                    } else {
                        System.out.println("El numero: " + palabra2 + " es menor que el numero: " + palabra3 + " : " + modulo3(palabra2, palabra3));
                    }
                };break;
            case 4:
                System.out.println("Ingrese un numero con la caracteristica seguida por un - y el numero");
                //Recuerde: el formato de numero de telefono es CCCC-NNNNNNNN.
                String palabra4 = TecladoIn.readLine();
                System.out.println("Ingrese un numero con la caracteristica seguida por un - y el numero");
                //Recuerde: el formato de numero de telefono es CCCC-NNNNNNNN.
                String palabra5 = TecladoIn.readLine();
                if (!numeroTelefono(palabra4)) {
                    System.out.println(errorNumero(palabra4));
                } else {
                    if (!numeroTelefono(palabra5)) {
                        System.out.println(errorNumero(palabra5));
                    } else {
                        System.out.println("El numero: " + palabra4 + " es igual que el numero : " + palabra5 + " : " + modulo4(palabra4, palabra5));
                    }
                };break;
            case 5:
                modulo5();break;
            case 6:
                modulo6();break;
            case 7:
                String palabra6;
                System.out.println("Ingrese un numero con un - despues de la caracteristica al que desee aumentar en 1");
                //Recuerde: el formato de numero de telefono es CCCC-NNNNNNNN.
                palabra6 = TecladoIn.readLine();
                if (!numeroTelefono(palabra6)) {
                    System.out.println(errorNumero(palabra6));
                } else {
                    System.out.println("El numero incrementado es: " + modulo7(palabra6));
                };break;
            case 8:
                String palabra7;
                int posIni = 0,
                 posFin = 14;
                boolean sigue = true;
                System.out.println("Ingrese una secuencia de numeros de telefono donde despues de la caracteristica tenga en - y luego entre cada numero una /");
                //Recuerde: el formato de una secuencia de numeros de telefono es CCCC-NNNNNNNNN/CCCC-NNNNNNNNN
                palabra7 = TecladoIn.readLine();
                int a = palabra7.length();
                while (posFin < a && sigue) {
                    sigue = palabra7.indexOf('/', posIni) == posFin;
                    if (sigue == false) {
                        System.out.println("Un numero ingresado es muy grande o se olvido de poner / entre los numeros");
                    }
                    posIni += 15;
                    posFin += 15;
                }
                if (sigue) {
                    modulo8(palabra7);
                };break;
            case 9:
                String palabra8;
                int posIni2 = 0,
                 posFin2 = 14;
                boolean sigue2 = true;
                System.out.println("Ingrese una secuencia de numeros de telefono donde despues de la caracteristica tenga en - y luego entre cada numero una /");
                //Recuerde: el formato de una secuencia de numeros de telefono es CCCC-NNNNNNNNN/CCCC-NNNNNNNNN
                palabra8 = TecladoIn.readLine();
                int a2 = palabra8.length();
                while (posFin2 < a2 && sigue2) {
                    sigue2 = palabra8.indexOf('/', posIni2) == posFin2;                
                    if (sigue2 == false) {
                        System.out.println("El numero es muy grande o se olvido de poner el / entre los numeros");
                    }
                    posIni2 += 15;
                    posFin2 += 15;
                }
                if (sigue2) {
                    modulo9(palabra8);
                };break;
            default:
                System.out.println("ERROR OPCION INCORRECTA");break;
        }
    }

    public static int menu() {
        //Este metodo muestra por pantalla una menu de opciones.
        int opcion;
        System.out.println("      1: Verificar si un numero de telefono es valido.");
        System.out.println("      2: Determinar porque un numero de telefono no es valido.");
        System.out.println("      3: Verificar si un numero de telefono es menor que otro.");
        System.out.println("      4: Verificar si un numero de telefono es igual a otro.");
        System.out.println("      5: Ingrese una secuencia de numeros de telefonos y obtener aquel numero mas grande.");
        System.out.println("      6: Ingrese una secuencia de numeros de telefonos y un numero de telefono determinado \"A\" y se halla la cantidad de ocurrencias de \"A\". ");
        System.out.println("      7: Incrementar un numero de telefono en una unidad.");
        System.out.println("      8: Dada una secuencia de numeros de telefonos obtener aquel numero mas grande.");
        System.out.println("      9: Dada una secuencia de numeros de telefonos y un numero de telefono determinado \"A\", se halla la cantidad de ocurrencias de \"A\" en la secuencia.");
        System.out.println("      10: Terminar.");
        System.out.println("Ingrese la opcion elegida o 10 si no desea empezar:");
        opcion = TecladoIn.readLineInt();
        return opcion;
    }

    public static void main(String[] args) {
        //Este metodo muestra en forma reiterada el modulo menu, finalizando cuando se ingrese el 10.
        int inicio;
        System.out.println("Las caracteristicas disponibles son: Neuquen(0299)/Roca(0298)/Bariloche(0294)/Mendoza(0261)/Bahia Blanca(0291)");
        System.out.println("Las opciones para elegir son: ");
        inicio = menu();
        while (inicio != 10) {
            modulo10(inicio);
            System.out.println("Las opciones para elegir son: ");
            inicio = menu();
        }
        System.out.println("NOS VEMOS :D");
    }
}
