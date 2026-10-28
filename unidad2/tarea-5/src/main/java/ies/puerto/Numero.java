package ies.puerto;

import java.util.Scanner;

public class Numero {
    static void main(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primer numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Segundo numero:");
        int numero2 = teclado.nextInt();

        boolean iguales = igual(numero1,numero2);
        System.out.println("Son iguales");
        int resultado = mayor(numero1, numero2);
        System.out.println("El numer mayor es "+resultado);
        resultado = menor(numero1, numero2);
        System.out.println("El numer menor es "+resultado);

    }
    static int mayor(int numero1, int numero2){
        if (numero1>numero2){
            return numero1;
        }
        return numero2;
    }
    static int menor (int numero1, int numero2){
        if (numero1<numero2){
            return numero1;
        }
        return numero2;
    }
    static boolean igual (int numero1, int numero2){
        if (numero1==numero2){
            return true;
        }
        return false;
    }

}
