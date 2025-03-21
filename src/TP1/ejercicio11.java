/*
: Simula un login donde el usuario tiene 3 intentos para ingresar una contraseña predefinida. Muestra un mensaje de acceso concedido o denegado según el caso.
 */

package TP1;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String contraseñaCorrecta = "1234";
        String contraseñaIngresada;
        int intentos = 0;
        int maxIntentos = 3;

        while (intentos < maxIntentos) {
            System.out.print("Ingrese la contraseña: ");
            contraseñaIngresada = entrada.nextLine();

            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("Acceso concedido");
                break;
            } else {
                intentos++;
                if (intentos < maxIntentos) {
                    System.out.println("Contraseña incorrecta. Te quedan " + (maxIntentos - intentos) + " intentos.");
                }
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Acceso denegado. Has superado el número máximo de intentos.");
        }

        entrada.close();
    }
}
