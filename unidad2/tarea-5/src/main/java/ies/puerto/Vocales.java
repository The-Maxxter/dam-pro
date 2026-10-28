package ies.puerto;

import java.util.Scanner;

/**
 *
 */
public class Vocales {
    public static void main(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la cadena de texto");
        String cadena = teclado.nextLine();
        int resultado = contarVocales(cadena);
        System.out.println("el numero de vocales es "+resultado);
    }
    static int contarVocales(String sCadena){
        if (sCadena == null || sCadena.isEmpty()){
            return 0;
        }
        int resultado =0;

        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            if (caracter == 'a'|| caracter == 'e'|| caracter == 'i'||caracter =='o'||caracter == 'u'){
                resultado = resultado+1;
            }
        }

        return  resultado;
    }
    static int contarVocales2(String sCadena){
        if (sCadena == null || sCadena.isEmpty()){
            return 0;
        }
        int resultado =0;


        for (int i = 0; i < sCadena.length(); i++) {
            char caracter = sCadena.charAt(i);
            switch (caracter){
                case "a", "e", "i", "o", "u"
            }
        }

        return  resultado;
    }
}
