/*
Solicita una calificación numérica entre 1 y 10 e imprime una descripción textual:
    - 1 a 3 → 'Insuficiente'
    - 4 a 5 → 'Regular'
    - 6 a 7 → 'Bueno'
    - 8 a 9 → 'Muy Bueno'
    - 10 → 'Excelente'
 */

package TP1;
import java.util.Scanner;

public class ejercicio6 {
    public static int pedirCalificacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una calificación entre 1 y 10: ");
        return entrada.nextInt();
    }

    public static String obtenerDescripcion(int calificacion) {
        if (calificacion >= 1 && calificacion <= 3) {
            return "Insuficiente";
        } else if (calificacion >= 4 && calificacion <= 5) {
            return "Regular";
        } else if (calificacion >= 6 && calificacion <= 7) {
            return "Bueno";
        } else if (calificacion >= 8 && calificacion <= 9) {
            return "Muy bueno";
        } else if (calificacion == 10) {
            return "Excelente";
        } else {
            return "Calificación fuera de rango";
        }
    }

    public static void main(String[] args) {
        int calificacion = pedirCalificacion();
        String descripcion = obtenerDescripcion(calificacion);
        System.out.println(descripcion);
    }
}
