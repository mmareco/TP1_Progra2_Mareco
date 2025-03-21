/*
Simula un menú con operaciones bancarias:
    1. Consultar saldo
    2. Depositar dinero
    3. Retirar dinero
    4. Salir
El saldo debe actualizarse según las operaciones del usuario.
 */

package TP1;
import java.util.Scanner;

public class ejercicio8 {
    public static void consultarSaldo(double saldo) {
        System.out.println("Tu saldo actual es: $" + saldo);
    }

    public static double depositar(double saldo, double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Has depositado $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
        return saldo;
    }

    public static double retirar(double saldo, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Has retirado $" + monto);
        } else if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return saldo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = 1000.00;
        int opcion;

        do {
            System.out.println("\n--- Menú de Operaciones Bancarias ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo(saldo);
                    break;
                case 2:
                    System.out.print("Ingresa el monto a depositar: $");
                    double montoDepositar = entrada.nextDouble();
                    saldo = depositar(saldo, montoDepositar);
                    break;
                case 3:
                    System.out.print("Ingresa el monto a retirar: $");
                    double montoRetirar = entrada.nextDouble();
                    saldo = retirar(saldo, montoRetirar);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingresa una opción válida.");
            }
        } while (opcion != 4);

        entrada.close();
    }

    /*
    RESOLUCION DE LA PROFE
    static int consultar(){
        int saldo = 5000;
        return saldo;
    }

    static void menu(){
        int opcion;
        Scanner consola = new Scanner(System.in);

        do {
            System.out.println("1- Consultar");
            System.out.println("2- Depositar");
            System.out.println("3- Retirar");
            System.out.println("4- Salir");
            System.out.println("Ingrese opcion: ");
            opcion = consola.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Consultando...");
                    System.out.println("El saldo actual es: "+ consultar());
                    break;
                case 2:
                    System.out.println("Depositando...");
                    //depositar();
                    break;
                case 3:
                    System.out.println("Retirando...");
                    //retirar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion!=0);
    }

    public static void main(String[] args) {
        menu();
    }

     */
}
