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
        float suma = 0;
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
            System.out.println(nombreProductos + "-" + precioProducto+" euros");
            suma = suma + precioProducto;CAT

            // 1. Pedir el nombre del cliente.
            // 2. Preguntar la cantidad de productos.
            // 3. Inicializar el acumulador total.
            // 4. Usar un bucle for para pedir los productos.
            // 5. Mostrar el número de productos y el total.
        }
        System.out.println("=======================");
        System.out.println("         TICKET        ");
        System.out.println("=======================");
        System.out.println("Cliente "+nombre);
        System.out.println("Productos comprados: "+productos);
        System.out.println("Total: "+ suma);
    }
}