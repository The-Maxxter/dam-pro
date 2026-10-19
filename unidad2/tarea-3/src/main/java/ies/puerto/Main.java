package ies.puerto;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float aportacion = 0;
        String respuesta = "S";
        System.out.println("====================================");
        System.out.println("        SIMULADOR DE AHORRO");
        System.out.println("====================================");
        System.out.println("Introduzca su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenid@, " + nombre + ".");
        System.out.println("Cuanto dinero tiene ahorrado?");
        float ahorros= scanner.nextFloat();
        float aportacionesTotales = 0;
        int contadorAportaciones=0;


        do{
            contadorAportaciones = contadorAportaciones+1;
            System.out.println("Introduce una cantidad para aportar");
            aportacion = scanner.nextFloat();
            scanner.nextLine();
            while (aportacion <= 0) {
                System.out.println("La aportacion tiene que ser mayor que 0");
                System.out.println("Introduce una cantidad para aportar");
                aportacion = scanner.nextFloat();
                scanner.nextLine();
            }
            ahorros +=aportacion;
            aportacionesTotales = aportacionesTotales+aportacion;
            System.out.println("Quieres aportar más?");
            respuesta = scanner.nextLine();

        } while(respuesta.equalsIgnoreCase("S"));
        System.out.println("Resumen de transacciones de "+nombre);
        System.out.println("Ahorro inicial: "+(ahorros-aportacionesTotales));
        System.out.println("Ahorro final: "+ahorros);
        System.out.println("Cantidad de veces que se añadio ua aportacion: "+contadorAportaciones);
        System.out.println("Total de aportaciones: "+aportacionesTotales);
    }
}