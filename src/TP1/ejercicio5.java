/*
Pide al usuario un número N. Calcula y muestra la suma de todos los números pares y la suma de los impares desde 1 hasta N inclusive.
 */

package TP1;

import java.util.Scanner;

public class ejercicio5 {
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero N: ");
        return entrada.nextInt();
    }

    public static int calcularSumarPares(int N){
        int sumaPares = 0;
        for (int i = 1; i<N; i++){
            if (i% 2 == 0){
                sumaPares +=i;
            }
        }
        return sumaPares;
    }

    public static int calcularSumaImpares(int N){
        int sumaImpares = 0;

        for (int i = 1; i <= N; i++){
            if (i % 2 != 0){
                sumaImpares += i;
            }
        }

        return sumaImpares;
    }

    public static void main(String[] args) {
        int N = pedirNumero();
        int sumaPares = calcularSumarPares(N);
        int sumaImpares = calcularSumaImpares(N);

        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Suma de los numeros impares: " + sumaImpares);
    }
}
