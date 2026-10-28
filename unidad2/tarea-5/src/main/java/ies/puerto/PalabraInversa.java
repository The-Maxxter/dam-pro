package ies.puerto;

import java.util.Scanner;

public class PalabraInversa {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una palabra:");
        String sPalabra = teclado.nextLine();
        String sInvertida= reverse(sPalabra);
        System.out.println("la palabra invertida es "+sInvertida);

    }

    /**
     * Crea una palabra o texto invertida a la original
     *
     * @param palabra String palabra/texto original
     * @return String Cadena invertida
     */
    static String reverse(String palabra) {
        StringBuilder resultado = new StringBuilder();
        if (palabra == null || palabra.isEmpty()) {
            return resultado.toString();
        }
        //size/lenght
        //palabra = |a|l|m|e|d|r|a|→ |a|r|d|e|m|l|a|
        for (int i = palabra.length() - 1; i >= 0; i--) {
            char caracter = palabra.charAt(i);
            resultado.append(caracter);
        }
        return resultado.toString();
    }
}
