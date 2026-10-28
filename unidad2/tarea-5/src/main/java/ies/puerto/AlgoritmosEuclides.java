package ies.puerto;

import java.util.Scanner;

public class AlgoritmosEuclides {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primer numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Segundo numero:");
        int numero2 = teclado.nextInt();
        int resultado = calcularMCD(numero1, numero2);

    }

    /**
     * Funcion que realiza el calculo del MCD
     * @param numero1
     * @param numero2
     * @return
     */
    static int calcularMCD(int numero1, int numero2){
        int resultado;
        numero1=Math.abs(numero1);
        numero2=Math.abs(numero2);

        while (numero2 != 0){
            int resto = numero1%numero2;
            numero1=numero2;
            numero2=resto;

        }
        return numero1;

    }
}
