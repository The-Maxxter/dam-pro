package ies.puerto;

import java.util.Scanner;

/**
 * funcion que cuenta el numero de mayusculas en una cadena
 * @author Mauro
 * @version 1.0.0
 */
public class AnalizadorContrasenias {

    /**
     *Programa Principal
     */

    static void main() {
        Scanner teclasdo = new Scanner(System.in);
        System.out.println("introduzca la contraseña:");
        String sContrasenia=teclasdo.nextLine();
        String resultado = generarInforme(sContrasenia);
        System.out.println(resultado);
    }

    static int contarMayusculas(String sContrasenia) {
        int numero = 0;
        //java 2026! |J|a|v|a|2|0|2|6|!|
        //java 2026! |0|1|2|3|4|5|67
        //Character.isUpperCase(c)
        for (int i = 0; 1 < sContrasenia.length(); i++) {
            char caracter = sContrasenia.charAt(i);
            if (Character.isAlphabetic(caracter) && (Character.isUpperCase(caracter))) {
                numero++;
            }
        }
        return numero;
    }

    static int contarMinusculas(String sContrasenia) {
        int numero = 0;
        //java 2026! |J|a|v|a|2|0|2|6|!|
        //java 2026! |0|1|2|3|4|5|67
        //Character.isUpperCase(c)
        for (int i = 0; 1 < sContrasenia.length(); i++) {
            char caracter = sContrasenia.charAt(i);
            if (Character.isAlphabetic(caracter) && (Character.isUpperCase(caracter))) {
                numero++;
            }
        }
        return numero;
    }
    static int contarDigitos(String sContrasenia) {
        int numero = 0;
        //java 2026! |J|a|v|a|2|0|2|6|!|
        //java 2026! |0|1|2|3|4|5|67
        //Character.isUpperCase(c)
        for (int i = 0; 1 < sContrasenia.length(); i++) {
            char caracter = sContrasenia.charAt(i);
            if (Character.isDigit(caracter)) {
                numero++;
            }
        }
        return numero;
    }
    static int contarSimbolos(String sContrasenia) {
        int numero = 0;
        //java 2026! |J|a|v|a|2|0|2|6|!|
        //java 2026! |0|1|2|3|4|5|67
        //Character.isUpperCase(c)
        for (int i = 0; 1 < sContrasenia.length(); i++) {
            char caracter = sContrasenia.charAt(i);
            if (!Character.isLetterOrDigit(caracter)) {
                numero++;
            }
        }
        return numero;
    }
    static boolean tieneLogitudMinimas(String sContrasenia){
        if (sContrasenia.length()<8){
            return false;
        }
        return true;
    }

    /**
     * funcion esContrasenaValida
     * @param sContrasenia
     * @return
     */
    static boolean esContrasenaValida(String sContrasenia){
        if (!tieneLogitudMinimas(sContrasenia)){
            return false;
        }
        if (contarMayusculas(sContrasenia) < 1) {
            return false;
        }
        if (contarMinusculas(sContrasenia) < 1) {
            return false;
        }
        if (contarDigitos(sContrasenia)<1){
            return false;
        }
        return true;
    }

    static String generarInforme(String sContrasnia){
        return "Digitps: "+contarDigitos(sContrasnia)+" Resultado: "+esContrasenaValida(sContrasnia);
    }
}


