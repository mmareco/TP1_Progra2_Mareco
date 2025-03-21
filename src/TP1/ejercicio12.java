package TP1;
import java.util.Scanner;

public class ejercicio12 {
    public static void contarVocalesConsonantes(String palabra) {
        int vocales = 0;
        int consonantes = 0;

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);

            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();

        contarVocalesConsonantes(palabra);

        entrada.close();
    }
}
