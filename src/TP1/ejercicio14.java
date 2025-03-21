package TP1;
import java.util.Scanner;

public class ejercicio14 {
    public static double calcularPromedio(double sumaNotas, int cantidadNotas) {
        return sumaNotas / cantidadNotas;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sumaNotas = 0;
        int cantidadNotas = 0;
        double nota;

        while (true) {
            System.out.print("Ingrese una nota (o -1 para terminar): ");
            nota = entrada.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota >= 0) {
                sumaNotas += nota;
                cantidadNotas++;
            } else {
                System.out.println("Nota no válida. Ingrese una nota positiva.");
            }
        }

        if (cantidadNotas > 0) {
            double promedio = calcularPromedio(sumaNotas, cantidadNotas);

            System.out.println("Promedio de notas: " + promedio);
            if (promedio > 6) {
                System.out.println("¡Aprobado!");
            } else {
                System.out.println("No aprobado.");
            }
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }

        entrada.close();
    }
}
