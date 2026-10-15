package ies.puerto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("         BIENVENIDO        ");
        System.out.println("===========================");
        System.out.println("Por favor, introdzca su nombre:");
        String nombre = teclado.nextLine();
        System.out.println("===========================");
        System.out.println("Bienvenido, " + nombre + "!");
        int contador = 0;
        int opcion = 0;
        double solucion = 0;
        while (opcion != 4) {
            contador = contador + 1;
            System.out.println("Elije una opcion:");
            System.out.println("1. Kilómetros a metros");
            System.out.println("2. Metros a centímetros");
            System.out.println("3. Kilómetros a millas");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();

            if (opcion==1){
                System.out.println("Introduce cuantos kilometros:");
                float kilometros = teclado.nextFloat();
                solucion = kilometros * 1000;
                System.out.println(kilometros+" kilometros son "+ solucion +" metros.");
            }
            if (opcion==2){
                System.out.println("Introduce cuantos metros:");
                float metros = teclado.nextFloat();
                solucion = metros * 100;
                System.out.println(metros+" metros son "+solucion+" centimetros.");
            }
            if (opcion==3){
                System.out.println("Introduce cuantos kilometros:");
                float kilometros = teclado.nextFloat();
                solucion = kilometros/1.609;
                System.out.println(kilometros+" kilometros son "+ solucion +" millas.");
            }

        }
        System.out.println("======================================");
        System.out.println("Usuario "+nombre);
        System.out.println("Conversiones realizadas: "+contador);
        System.out.println("Gracias por utilizar este programa!");
        System.out.println("=====================================");
    }
}
