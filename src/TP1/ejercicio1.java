/*
Crear un programa que muestre un menú con las siguientesopciones:
 - Sumar
 - Restar
 - Multiplicar
 - Dividir
 - Salir
El usuario debe ingresar dos números y elegir una operación. El programa debe mostrar el resultado y volver al menú que el usuario elija salir.
 */

package TP1;

import java.util.Scanner;

public class ejercicio1 {

    public static int mostrarMenu(Scanner entrada){
        System.out.println("\n1. Sumar \n2. Restar \n3. Multiplicar \n 4. Dividir \n 5. Salir");
        System.out.println("Seleccione una opción:");
        return entrada.nextInt();
    }

    public static double obtenerNumero(Scanner entrada, String mensaje) {
        System.out.print(mensaje);
        return entrada.nextDouble();
    }

    public static void realizarCalculo(int opcion, double num1, double num2) {
        double resultado = 0;
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("No se puede dividir por cero.");
                    return;
                }else{
                    resultado = num1 / num2;
                    break;
                }
        }
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            opcion = mostrarMenu(entrada);

            if (opcion >= 1 && opcion <=4){
                double num1 = obtenerNumero(entrada, "Ingrese el primer numero: ");
                double num2 = obtenerNumero(entrada, "Ingrese el segundo numero: ");
                realizarCalculo(opcion, num1, num2);
            } else if (opcion == 5){
                System.out.println("Saliendo...");
                break;
            }
        }while (true);

        entrada.close();
    }
}


