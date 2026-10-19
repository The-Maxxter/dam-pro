package ies.puerto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

            //no, está mal. No se como hacerlo con el do-while

            respuesta = scanner.nextLine();

            switch(respuesta){
                case "s", "S": System.out.println("Introduce una cantidad");
                    float ahorros = scanner.nextFloat();
                    respuesta = scanner.nextLine();
                    System.out.println("Aportacion registrada. ahorros actuales: " + ahorros + " Euros.");
                    System.out.println("¿Realizar ora aportacion?");
                    ahorros = ahorros + scanner.nextFloat();
                    break;

                //???????

                case 2:
                    System.out.println("fin");
            }
        }while ("si".equals(respuesta));
    }
}
//yqs