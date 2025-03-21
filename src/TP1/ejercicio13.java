/*
Pide un número entero y verifica si es capicúa (igual leído de izquierda a derecha que de derecha a izquierda).
 */

package TP1;
import java.util.Scanner;

public class ejercicio13 {
    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        return original == invertido;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = entrada.nextInt();

        if (esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        entrada.close();
    }
}
