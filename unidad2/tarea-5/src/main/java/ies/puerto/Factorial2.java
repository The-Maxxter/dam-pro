package ies.puerto;

import java.util.Scanner;

public class Factorial2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = teclado.nextInt();
        int resultado = calcular(numero);
        System.out.println("Factorial de "+numero+" es "+resultado);

    }
    /**
     * Calcular el factorial de un numero dado
     * @param numero int para el calculo del factorial
     * @return int con el resultado
     */
    static int calcular (int numero){
        if (numero <= 1){
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i < numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
