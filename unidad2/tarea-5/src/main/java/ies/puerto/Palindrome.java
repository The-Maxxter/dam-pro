package ies.puerto;

import java.util.Scanner;

public class Palindrome {
    /**
     * @autor Mauro
     * @version 1.0.0
     */
    static void main(){
        Scanner teclado = new Scanner((System.in));
        System.out.println("Introduce la palabra o frase a analizar");
        String sFrase = teclado.nextLine();
        boolean bPalindromo = esPalindrome(sFrase);
        System.out.println("La palabra oalindroma es "+bPalindromo);

    }

    /**
     * Funcion que recibe una palabra o frase
     * @param frase
     * @return
     */
    static boolean esPalindrome (String frase) {
        if (frase == null || frase.isEmpty()) {
            return true;
        }
        frase = frase.toLowerCase();
        frase = frase.replace(" ", "");
        for (int i = 0; i < frase.length(); i++) {
            char letraIzquierda = frase.charAt(i);
            char letraDerecha = frase.charAt(frase.length() - 1 - i);
            if (letraIzquierda != letraDerecha) {
                return false;

            }
        }
        return false;
    }

}