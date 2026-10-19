package ies.puerto;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                    System.out.println("====================================");
                    System.out.println("        SIMULADOR DE AHORRO");
                    System.out.println("====================================");
                    System.out.println("Introduzca su nombre:");
                    String nombre = scanner.nextLine();
                    System.out.println("Bienvenid@, " + nombre + ".");
                    String respuesta = "";
                    do {

                        respuesta = scanner.nextLine();

                        switch (respuesta) {
                            case "s", "S":
                                System.out.println("Introduce una cantidad");
                                float ahorros = scanner.nextFloat();
                                respuesta = scanner.nextLine();
                                System.out.println("Aportacion registrada. ahorros actuales: " + ahorros + " Euros.");
                                System.out.println("¿Realizar ora aportacion?");
                                ahorros = ahorros + scanner.nextFloat();
                                break
                            case "n", "N":
                                System.out.println("Ahorros finales: " + ahorros);
                                return
                            default:
                                System.out.println("Opcion invalida");

                    break;
            }
        }while ("si".equals(respuesta));
    }
}
