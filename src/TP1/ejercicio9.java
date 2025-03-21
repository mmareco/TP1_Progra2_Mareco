package TP1;
import java.util.Scanner;

public class ejercicio9 {
    public static long calcularFactorial(int numero) {
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else {
            long resultado = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }

        entrada.close();
    }
}
