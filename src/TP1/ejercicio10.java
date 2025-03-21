/*
Pide al usuario un número N y muestra los primeros N términos de la serie de Fibonacci: 0, 1, 1, 2, 3, 5, 8...
 */

package TP1;
import java.util.Scanner;

public class ejercicio10 {
    public static void mostrarFibonacci(int N) {
        long a = 0, b = 1;
        System.out.print("Los primeros " + N + " términos de la serie de Fibonacci son: ");

        if (N >= 1) {
            System.out.print(a + " ");
        }

        for (int i = 2; i <= N; i++) {
            System.out.print(b + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de términos de la serie de Fibonacci que desea mostrar: ");
        int N = entrada.nextInt();

        mostrarFibonacci(N);

        entrada.close();
    }
}
