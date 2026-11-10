package es.educacion.arrays;

// Devuelve el índice de la primera aparición o -1. No requiere ordenar. Null: IllegalArgumentException.
// 
// TODO: implementar el método y documentar la clase y el método mediante Javadoc.
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    //|8|3|5|6|
    //|0|1|2|3|

    // Devuelve el índice de la primera aparición o -1. No requiere ordenar. Null: IllegalArgumentException.
    public static int buscar(int[] numeros, int objetivo) {
        if (numeros==null||numeros.length==0){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero==objetivo){
                return i;
            }

        }
        return -1;
    }
}
