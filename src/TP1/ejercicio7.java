package TP1;
import java.util.Scanner;
import java.util.Random;

public class ejercicio7 {

    public static int generarNumeroSecreto() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Adivina el número (entre 1 y 100): ");
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        int numeroSecreto = generarNumeroSecreto();
        int intento;
        boolean acertado = false;

        while (!acertado) {
            intento = pedirNumero();

            if (intento < numeroSecreto) {
                System.out.println("El número ingresado es menor que el secreto.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número ingresado es mayor que el secreto.");
            } else {
                System.out.println("¡Felicidades! Has acertado el número.");
                acertado = true;
            }
        }
    }
}
