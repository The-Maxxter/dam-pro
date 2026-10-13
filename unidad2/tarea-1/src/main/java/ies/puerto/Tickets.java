package ies.puerto;

import java.util.Scanner;

/**
 * @author Mauro
 * @version 1.0.0
 */
public class Tickets {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int productos = 0;
        float suma;
        System.out.println("Introduce el nombre");
        String nombre = teclado.nextLine();
        System.out.println("Cuantos productos vas a comprar?");
        productos = teclado.nextInt();

        for(int i = 1; i <=productos; i++){
            System.out.println("Productos" + i);
            teclado.nextLine();
            System.out.println("Nombre:");
            String nombreProductos = teclado.nextLine();
            System.out.println("Precio:");
            float precioProducto = teclado.nextFloat();
            System.out.println(nombreProductos + "-" + precioProducto+" eurosawa");
        }
    }
}