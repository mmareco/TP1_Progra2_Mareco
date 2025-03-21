package TP1;

import java.util.Scanner;

public class ejercicio4 {
    public static int contarDigitos(int numero) {
        int digitos = 0;

        while (numero > 0) {
            numero /= 10;
            digitos++;
        }

        return digitos;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = entrada.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            int cantidadDigitos = contarDigitos(numero);
            System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        }

        entrada.close();
    }

    /*

    RESOLUCION DE LA PROFE

    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        int num = entrada.nextInt();
        entrada.close();
        int contador = 0;
        int temp = num; // variable temporal para no modificar el numero

        do {
            contador ++;
            temp = temp/10;
        } while (temp > 0);

        System.out.println("el numero " + num + " tiene " + contador + " digitos");

    }

     */
}
