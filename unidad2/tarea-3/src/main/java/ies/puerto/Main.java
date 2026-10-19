package ies.puerto;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================\n" +
                "       SIMULADOR DE AHORRO\n" +
                "====================================");
        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Hola, "+nombre);
        System.out.println("Dinero ahorrado:");
        float ahorros = scanner.nextFloat();
        String respuesta;

        do {
            System.out.println("¿Otra aportacion?");
            respuesta = scanner.nextLine();
            if
        } while ("S".equalsIgnoreCase(respuesta));
    }
}
