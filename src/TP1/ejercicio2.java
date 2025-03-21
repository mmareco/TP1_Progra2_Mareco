/*
Solicita un número entero y determina si es primo o no. Un número es primo si solo es divisible por 1 y por sí mismo.
 */

package TP1;

import java.util.Scanner;

public class ejercicio2 {
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        entrada.close();
    }

    /*
    RESOLUCION DE LA PROFE
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        int numero = entrada.nextInt();
        boolean esPrimo = true;
        int resto;

        for (int i = 2; i < numero; i++){
            resto = numero % i;
            if (resto == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }

    }
     */
}


