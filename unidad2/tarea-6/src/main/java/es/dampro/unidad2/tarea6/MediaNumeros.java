package es.dampro.unidad2.tarea6;

import java.util.Scanner;

/** TODO: documenta la finalidad de la clase. */
public final class MediaNumeros {
    private MediaNumeros() { }

    /**
    public static void main(String){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero :");
        String sNumero = String.valueOf(cNumero);

    }
**/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero :");
        String sNumero =teclado.nextLine();

    }
    /**
     * TODO: describe cómo se realiza el algoritmo.
     * @param numeros Documenta el parámetro.
     * @return Documenta el valor devuelto.
     */
    public static double calcularMedia(String numeros) {
        if (numeros == null || numeros.isEmpty()){
            return 0;
        }
        for (int i = 0; i < numeros.length(); i++) {
            char cNumero = numeros.charAt(i);
            String sNumero = String.valueOf(cNumero);
            int nNumero = Integer.parseInt(sNumero);
            float media = ;


        }
        throw new UnsupportedOperationException("Pendiente de implementar");
    }
}
