/*
Pide al usuario un número entero y muestra su tabla de multiplicar del 1 al 10,
 */

package TP1;

import java.util.Scanner;

public class ejercicio3 {

    public static void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        mostrarTablaMultiplicar(numero);

        entrada.close();
    }

    /*
    SOLUCION DE LA PROFE
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        int numero;
        int i = 0;
        System.out.println("Numero que sea multiplicar: ");
        int numero = consola.nextInt();

        do {
            System.out.println(numero + " + " + i + " = "+numero+i);
            i++;
        } while (i<=10);
         */

        /*
        while(i<=10){
            System.out.println(numero + " + "+i+" = "+numero+i);
            i++
        }
        */

        /*
        for (int i=1; i<=10; i++){
            System.out.println(numero + " "+ i +" = "+numero*i);
        }
    }

         */
}
