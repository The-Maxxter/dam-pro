package es.educacion.arrays;

// Calcula la media aritmética con decimales. Vacío o null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio02Media {
    private Ejercicio02Media() { }

    public static void main(String[] args) {
        int [] notas = {8,7,3,2,10};
        double resultado = media(notas);
        System.out.println("media :"+resultado);
    }
    /**
     * calcula media de un array de notas
     * @param notas int[] de notas
     * @return double con resultado
     * @exception IllegalArgumentException
     */

    public static double media(int[] notas) {
        if (notas==null||notas.length ==0){
            throw new IllegalArgumentException();
        }
        double suma = 0;
        for (double nota:notas){
            suma = suma + nota;
        }
        return suma/notas.length;
    }
}
